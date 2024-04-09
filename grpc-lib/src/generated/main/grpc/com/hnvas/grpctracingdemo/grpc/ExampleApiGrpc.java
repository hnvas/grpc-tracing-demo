package com.hnvas.grpctracingdemo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: example_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExampleApiGrpc {

  private ExampleApiGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ExampleApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hnvas.grpctracingdemo.grpc.HelloRequest,
      com.hnvas.grpctracingdemo.grpc.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.hnvas.grpctracingdemo.grpc.HelloRequest.class,
      responseType = com.hnvas.grpctracingdemo.grpc.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hnvas.grpctracingdemo.grpc.HelloRequest,
      com.hnvas.grpctracingdemo.grpc.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.hnvas.grpctracingdemo.grpc.HelloRequest, com.hnvas.grpctracingdemo.grpc.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = ExampleApiGrpc.getSayHelloMethod) == null) {
      synchronized (ExampleApiGrpc.class) {
        if ((getSayHelloMethod = ExampleApiGrpc.getSayHelloMethod) == null) {
          ExampleApiGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.hnvas.grpctracingdemo.grpc.HelloRequest, com.hnvas.grpctracingdemo.grpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hnvas.grpctracingdemo.grpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hnvas.grpctracingdemo.grpc.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleApiMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hnvas.grpctracingdemo.grpc.HelloRequest,
      com.hnvas.grpctracingdemo.grpc.HelloReply> getSayHelloErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloError",
      requestType = com.hnvas.grpctracingdemo.grpc.HelloRequest.class,
      responseType = com.hnvas.grpctracingdemo.grpc.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hnvas.grpctracingdemo.grpc.HelloRequest,
      com.hnvas.grpctracingdemo.grpc.HelloReply> getSayHelloErrorMethod() {
    io.grpc.MethodDescriptor<com.hnvas.grpctracingdemo.grpc.HelloRequest, com.hnvas.grpctracingdemo.grpc.HelloReply> getSayHelloErrorMethod;
    if ((getSayHelloErrorMethod = ExampleApiGrpc.getSayHelloErrorMethod) == null) {
      synchronized (ExampleApiGrpc.class) {
        if ((getSayHelloErrorMethod = ExampleApiGrpc.getSayHelloErrorMethod) == null) {
          ExampleApiGrpc.getSayHelloErrorMethod = getSayHelloErrorMethod =
              io.grpc.MethodDescriptor.<com.hnvas.grpctracingdemo.grpc.HelloRequest, com.hnvas.grpctracingdemo.grpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloError"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hnvas.grpctracingdemo.grpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hnvas.grpctracingdemo.grpc.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleApiMethodDescriptorSupplier("SayHelloError"))
              .build();
        }
      }
    }
    return getSayHelloErrorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExampleApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleApiStub>() {
        @java.lang.Override
        public ExampleApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleApiStub(channel, callOptions);
        }
      };
    return ExampleApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExampleApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleApiBlockingStub>() {
        @java.lang.Override
        public ExampleApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleApiBlockingStub(channel, callOptions);
        }
      };
    return ExampleApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExampleApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleApiFutureStub>() {
        @java.lang.Override
        public ExampleApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleApiFutureStub(channel, callOptions);
        }
      };
    return ExampleApiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sayHello(com.hnvas.grpctracingdemo.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.hnvas.grpctracingdemo.grpc.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    default void sayHelloError(com.hnvas.grpctracingdemo.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.hnvas.grpctracingdemo.grpc.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloErrorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExampleApi.
   */
  public static abstract class ExampleApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExampleApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExampleApi.
   */
  public static final class ExampleApiStub
      extends io.grpc.stub.AbstractAsyncStub<ExampleApiStub> {
    private ExampleApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleApiStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.hnvas.grpctracingdemo.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.hnvas.grpctracingdemo.grpc.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloError(com.hnvas.grpctracingdemo.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.hnvas.grpctracingdemo.grpc.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloErrorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExampleApi.
   */
  public static final class ExampleApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExampleApiBlockingStub> {
    private ExampleApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hnvas.grpctracingdemo.grpc.HelloReply sayHello(com.hnvas.grpctracingdemo.grpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hnvas.grpctracingdemo.grpc.HelloReply sayHelloError(com.hnvas.grpctracingdemo.grpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloErrorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExampleApi.
   */
  public static final class ExampleApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExampleApiFutureStub> {
    private ExampleApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hnvas.grpctracingdemo.grpc.HelloReply> sayHello(
        com.hnvas.grpctracingdemo.grpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hnvas.grpctracingdemo.grpc.HelloReply> sayHelloError(
        com.hnvas.grpctracingdemo.grpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloErrorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_ERROR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.hnvas.grpctracingdemo.grpc.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.hnvas.grpctracingdemo.grpc.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_ERROR:
          serviceImpl.sayHelloError((com.hnvas.grpctracingdemo.grpc.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.hnvas.grpctracingdemo.grpc.HelloReply>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hnvas.grpctracingdemo.grpc.HelloRequest,
              com.hnvas.grpctracingdemo.grpc.HelloReply>(
                service, METHODID_SAY_HELLO)))
        .addMethod(
          getSayHelloErrorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hnvas.grpctracingdemo.grpc.HelloRequest,
              com.hnvas.grpctracingdemo.grpc.HelloReply>(
                service, METHODID_SAY_HELLO_ERROR)))
        .build();
  }

  private static abstract class ExampleApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExampleApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hnvas.grpctracingdemo.grpc.ExampleApiOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExampleApi");
    }
  }

  private static final class ExampleApiFileDescriptorSupplier
      extends ExampleApiBaseDescriptorSupplier {
    ExampleApiFileDescriptorSupplier() {}
  }

  private static final class ExampleApiMethodDescriptorSupplier
      extends ExampleApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExampleApiMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExampleApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExampleApiFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloErrorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
