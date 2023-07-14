/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.rocketmq.eventbridge;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongHistogram;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.ObservableLongCounter;
import io.opentelemetry.api.metrics.ObservableLongGauge;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporter;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder;
import io.opentelemetry.exporter.prometheus.PrometheusHttpServer;
import io.opentelemetry.exporter.logging.LoggingMetricExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentSelector;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.SdkMeterProviderBuilder;
import io.opentelemetry.sdk.metrics.View;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.export.PeriodicMetricReader;
import io.opentelemetry.sdk.resources.Resource;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;

import org.apache.rocketmq.eventbridge.metrics.NopLongCounter;
import org.apache.rocketmq.eventbridge.metrics.NopLongHistogram;
import org.apache.rocketmq.eventbridge.metrics.NopObservableLongGauge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import static org.apache.rocketmq.eventbridge.BridgeMetricsConstant.*;


public class BridgeMetricsManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(BridgeMetricsManager.class);

    private final BridgeConfig bridgeConfig;
    private final static Map<String, String> LABEL_MAP = new HashMap<>();
    private OtlpGrpcMetricExporter metricExporter;
    private PeriodicMetricReader periodicMetricReader;
    private PrometheusHttpServer prometheusHttpServer;
    private LoggingMetricExporter loggingMetricExporter;
    private Meter bridgeMeter;

    // queue stats metrics
    public static ObservableLongGauge targetGauge = new NopObservableLongGauge();
    public static ObservableLongGauge ruleGauge = new NopObservableLongGauge();


    //invoke timeout
    public static LongHistogram invokeLatency = new NopLongHistogram();

    // request metrics
    public static ObservableLongCounter messagesInTotal = new NopLongCounter();

    public static LongHistogram messageSize = new NopLongHistogram();

    public BridgeMetricsManager(BridgeConfig bridgeConfig) {
        this.bridgeConfig = bridgeConfig;
    }


    public static AttributesBuilder newAttributesBuilder() {
        AttributesBuilder attributesBuilder = Attributes.builder();
        LABEL_MAP.forEach(attributesBuilder::put);
        return attributesBuilder;
    }

    private boolean checkConfig() {
        if (bridgeConfig == null) {
            return false;
        }
        BridgeConfig.MetricsExporterType exporterType = bridgeConfig.getMetricsExporterType();
        if (!exporterType.isEnable()) {
            return false;
        }

        switch (exporterType) {
            case OTLP_GRPC:
                return StringUtils.isNotBlank(bridgeConfig.getMetricsGrpcExporterTarget());
            case PROM:
                return true;
            case LOG:
                return true;
        }
        return false;
    }

    public void init() {
        BridgeConfig.MetricsExporterType metricsExporterType = bridgeConfig.getMetricsExporterType();
        if (metricsExporterType == BridgeConfig.MetricsExporterType.DISABLE) {
            return;
        }

        if (!checkConfig()) {
            LOGGER.error("check metrics config failed, will not export metrics");
            return;
        }

        SdkMeterProviderBuilder providerBuilder = SdkMeterProvider.builder()
            .setResource(Resource.empty());

        if (metricsExporterType == BridgeConfig.MetricsExporterType.OTLP_GRPC) {
            String endpoint = bridgeConfig.getMetricsGrpcExporterTarget();
            if (!endpoint.startsWith("http")) {
                endpoint = "https://" + endpoint;
            }
            OtlpGrpcMetricExporterBuilder metricExporterBuilder = OtlpGrpcMetricExporter.builder()
                .setEndpoint(endpoint)
                .setTimeout(bridgeConfig.getMetricGrpcExporterTimeOutInMills(), TimeUnit.MILLISECONDS)
                .setAggregationTemporalitySelector(type -> {
                    if (bridgeConfig.isMetricsInDelta() &&
                        (type == InstrumentType.COUNTER || type == InstrumentType.OBSERVABLE_COUNTER || type == InstrumentType.HISTOGRAM)) {
                        return AggregationTemporality.DELTA;
                    }
                    return AggregationTemporality.CUMULATIVE;
                });

            String headers = bridgeConfig.getMetricsGrpcExporterHeader();
            if (StringUtils.isNotBlank(headers)) {
                Map<String, String> headerMap = new HashMap<>();
                List<String> kvPairs = Splitter.on(',').omitEmptyStrings().splitToList(headers);
                for (String item : kvPairs) {
                    String[] split = item.split(":");
                    if (split.length != 2) {
                        LOGGER.warn("metricsGrpcExporterHeader is not valid: {}", headers);
                        continue;
                    }
                    headerMap.put(split[0], split[1]);
                }
                headerMap.forEach(metricExporterBuilder::addHeader);
            }

            metricExporter = metricExporterBuilder.build();

            periodicMetricReader = PeriodicMetricReader.builder(metricExporter)
                .setInterval(bridgeConfig.getMetricGrpcExporterIntervalInMills(), TimeUnit.MILLISECONDS)
                .build();

            providerBuilder.registerMetricReader(periodicMetricReader);
        }

        if (metricsExporterType == BridgeConfig.MetricsExporterType.PROM) {
            String promExporterHost = bridgeConfig.getMetricsPromExporterHost();
            if (StringUtils.isBlank(promExporterHost)) {
                promExporterHost = bridgeConfig.getEventBridgeAddress();
            }
            prometheusHttpServer = PrometheusHttpServer.builder()
                .setHost(promExporterHost)
                .setPort(bridgeConfig.getMetricsPromExporterPort())
                .build();
            providerBuilder.registerMetricReader(prometheusHttpServer);
        }

        if (metricsExporterType == BridgeConfig.MetricsExporterType.LOG) {
            SLF4JBridgeHandler.removeHandlersForRootLogger();
            SLF4JBridgeHandler.install();
            loggingMetricExporter = LoggingMetricExporter.create(bridgeConfig.isMetricsInDelta() ? AggregationTemporality.DELTA : AggregationTemporality.CUMULATIVE);
            java.util.logging.Logger.getLogger(LoggingMetricExporter.class.getName()).setLevel(java.util.logging.Level.FINEST);
            periodicMetricReader = PeriodicMetricReader.builder(loggingMetricExporter)
                .setInterval(bridgeConfig.getMetricLoggingExporterIntervalInMills(), TimeUnit.MILLISECONDS)
                .build();
            providerBuilder.registerMetricReader(periodicMetricReader);
        }

        registerMetricsView(providerBuilder);

        bridgeMeter = OpenTelemetrySdk.builder()
            .setMeterProvider(providerBuilder.build())
            .buildAndRegisterGlobal()
            .getMeter(OPEN_TELEMETRY_METER_NAME);
    }

    private void registerMetricsView(SdkMeterProviderBuilder providerBuilder) {
        // message size buckets, 1k, 4k, 512k, 1M, 2M, 4M
        List<Double> messageSizeBuckets = Arrays.asList(
            1d * 1024, //1KB
            4d * 1024, //4KB
            512d * 1024, //512KB
            1d * 1024 * 1024, //1MB
            2d * 1024 * 1024, //2MB
            4d * 1024 * 1024 //4MB
        );
        InstrumentSelector messageSizeSelector = InstrumentSelector.builder()
            .setType(InstrumentType.HISTOGRAM)
            .setName(HISTOGRAM_MESSAGE_SIZE)
            .build();
        View messageSizeView = View.builder()
            .setAggregation(Aggregation.explicitBucketHistogram(messageSizeBuckets))
            .build();
        providerBuilder.registerView(messageSizeSelector, messageSizeView);

        for (Pair<InstrumentSelector, View> selectorViewPair : getMetricsView()) {
            providerBuilder.registerView(selectorViewPair.getObject1(), selectorViewPair.getObject2());
        }
    }

    //TODO 设置一个metricsGroup组 放置已经注册的runnerName和accountId
    public BridgeMetricsManager addGroup(String groupName, String metricName) {

        return new BridgeMetricsManager(new BridgeConfig());
    }


    public <T> void gaugeMetrics(String metricName, int count, String label, String value) {

        targetGauge = bridgeMeter.gaugeBuilder(metricName)
            .setDescription("Request processor gauge")
            .ofLongs()
            .buildWithCallback(measurement -> {
                measurement.record(count, newAttributesBuilder().put(label, value).build());
            });
    }

    public <T> void gaugeMetricsByMeter(Meter meter, String metricName,  String label, String value, long count) {
        ruleGauge = meter.gaugeBuilder(metricName)
            .setDescription("Request processor gauge")
            .ofLongs()
            .buildWithCallback(measurement -> {
                measurement.record(count, newAttributesBuilder().put(label, value).build());
            });

    }

    public void countMetrics(String metricName, String label, String value, long count ) {
        messagesInTotal = bridgeMeter.counterBuilder(metricName)
            .setDescription("Total number of incoming messages")
            .buildWithCallback( counter -> {
                counter.record( count, newAttributesBuilder().put(label, value).build());
            });

    }

    public void histogramMetrics(String metricName, String label, String value) {
        messageSize = bridgeMeter.histogramBuilder(metricName)
            .setDescription("Incoming messages size")
            .ofLongs()
            .build();
    }

    public void histogramMetricsByMeter(Meter meter) {
        invokeLatency = meter.histogramBuilder(HISTOGRAM_RPC_LATENCY)
            .setDescription("invoke latency")
            .setUnit("milliseconds")
            .ofLongs()
            .build();

    }

    public static List<Pair<InstrumentSelector, View>> getMetricsView() {
        List<Double> rpcCostTimeBuckets = Arrays.asList(
            (double) Duration.ofMillis(1).toMillis(),
            (double) Duration.ofMillis(3).toMillis(),
            (double) Duration.ofMillis(5).toMillis(),
            (double) Duration.ofMillis(7).toMillis(),
            (double) Duration.ofMillis(10).toMillis(),
            (double) Duration.ofMillis(100).toMillis(),
            (double) Duration.ofSeconds(1).toMillis(),
            (double) Duration.ofSeconds(2).toMillis(),
            (double) Duration.ofSeconds(3).toMillis()
        );
        InstrumentSelector selector = InstrumentSelector.builder()
            .setType(InstrumentType.HISTOGRAM)
            .setName(HISTOGRAM_RPC_LATENCY)
            .build();
        View view = View.builder()
            .setAggregation(Aggregation.explicitBucketHistogram(rpcCostTimeBuckets))
            .build();
        return Lists.newArrayList(new Pair<>(selector, view));
    }


    public void shutdown() {
        if (bridgeConfig.getMetricsExporterType() == BridgeConfig.MetricsExporterType.OTLP_GRPC) {
            periodicMetricReader.forceFlush();
            periodicMetricReader.shutdown();
            metricExporter.shutdown();
        }
        if (bridgeConfig.getMetricsExporterType() == BridgeConfig.MetricsExporterType.PROM) {
            prometheusHttpServer.forceFlush();
            prometheusHttpServer.shutdown();
        }
        if (bridgeConfig.getMetricsExporterType() == BridgeConfig.MetricsExporterType.LOG) {
            periodicMetricReader.forceFlush();
            periodicMetricReader.shutdown();
            loggingMetricExporter.shutdown();
        }
    }
}