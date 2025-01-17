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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.eventbridge.adapter.storage.rocketmq.runtimer.consumer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.time.Duration;
import java.util.List;

/**
 * @Author changfeng
 * @Date 2023/4/9 10:09 上午
 */
public interface LitePullConsumer {
    void startup() throws MQClientException;

    void shutdown();

    void attachTopic(String topic, String tag);

    List<MessageExt> poll(int pullBatchSize, Duration timeout);

    void commit(List<String> messageIdList);

    void setSockProxyJson(String proxyJson);

    void subscribe(String topic);

    void unsubscribe(String topic);
}
