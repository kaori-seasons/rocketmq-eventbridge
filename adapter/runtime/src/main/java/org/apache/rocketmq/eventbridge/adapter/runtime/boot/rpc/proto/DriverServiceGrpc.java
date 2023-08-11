package org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: driver.proto")
public class DriverServiceGrpc {

  private DriverServiceGrpc() {}

  public static final String SERVICE_NAME = "DriverService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq,
      org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes> METHOD_EXECUTE_PIPELINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "DriverService", "executePipeline"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_CLOSE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "DriverService", "close"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DriverServiceStub newStub(io.grpc.Channel channel) {
    return new DriverServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DriverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DriverServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DriverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DriverServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface DriverService {

    /**
     * <pre>
     *接受client提交过来的pipelineTasks
     * </pre>
     */
    public void executePipeline(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes> responseObserver);

    /**
     * <pre>
     * 关闭结束driver
     * </pre>
     */
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class DriverServiceImplBase implements DriverService, io.grpc.BindableService {

    @java.lang.Override
    public void executePipeline(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE_PIPELINE, responseObserver);
    }

    @java.lang.Override
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLOSE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return DriverServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface DriverServiceBlockingClient {

    /**
     * <pre>
     *接受client提交过来的pipelineTasks
     * </pre>
     */
    public java.util.Iterator<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes> executePipeline(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq request);

    /**
     * <pre>
     * 关闭结束driver
     * </pre>
     */
    public com.google.protobuf.Empty close(com.google.protobuf.Empty request);
  }

  /**
   */
  @java.lang.Deprecated public static interface DriverServiceFutureClient {

    /**
     * <pre>
     * 关闭结束driver
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> close(
        com.google.protobuf.Empty request);
  }

  public static class DriverServiceStub extends io.grpc.stub.AbstractStub<DriverServiceStub>
      implements DriverService {
    private DriverServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DriverServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DriverServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void executePipeline(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_EXECUTE_PIPELINE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLOSE, getCallOptions()), request, responseObserver);
    }
  }

  public static class DriverServiceBlockingStub extends io.grpc.stub.AbstractStub<DriverServiceBlockingStub>
      implements DriverServiceBlockingClient {
    private DriverServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DriverServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DriverServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes> executePipeline(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_EXECUTE_PIPELINE, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty close(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLOSE, getCallOptions(), request);
    }
  }

  public static class DriverServiceFutureStub extends io.grpc.stub.AbstractStub<DriverServiceFutureStub>
      implements DriverServiceFutureClient {
    private DriverServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DriverServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DriverServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> close(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLOSE, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractDriverService extends DriverServiceImplBase {}

  private static final int METHODID_EXECUTE_PIPELINE = 0;
  private static final int METHODID_CLOSE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DriverService serviceImpl;
    private final int methodId;

    public MethodHandlers(DriverService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_PIPELINE:
          serviceImpl.executePipeline((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq) request,
              (io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_EXECUTE_PIPELINE,
        METHOD_CLOSE);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final DriverService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_EXECUTE_PIPELINE,
          asyncServerStreamingCall(
            new MethodHandlers<
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineReq,
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Driver.PipelineRes>(
                serviceImpl, METHODID_EXECUTE_PIPELINE)))
        .addMethod(
          METHOD_CLOSE,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_CLOSE)))
        .build();
  }
}
