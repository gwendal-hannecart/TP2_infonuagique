package imcPersonne;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.2)",
    comments = "Source: IMC.proto")
public final class imcServiceGrpc {

  private imcServiceGrpc() {}

  public static final String SERVICE_NAME = "imcPersonne.imcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<imcPersonne.imcPersonneRequest,
      imcPersonne.imcResponse> getTestHelloWorldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testHelloWorld",
      requestType = imcPersonne.imcPersonneRequest.class,
      responseType = imcPersonne.imcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<imcPersonne.imcPersonneRequest,
      imcPersonne.imcResponse> getTestHelloWorldMethod() {
    io.grpc.MethodDescriptor<imcPersonne.imcPersonneRequest, imcPersonne.imcResponse> getTestHelloWorldMethod;
    if ((getTestHelloWorldMethod = imcServiceGrpc.getTestHelloWorldMethod) == null) {
      synchronized (imcServiceGrpc.class) {
        if ((getTestHelloWorldMethod = imcServiceGrpc.getTestHelloWorldMethod) == null) {
          imcServiceGrpc.getTestHelloWorldMethod = getTestHelloWorldMethod =
              io.grpc.MethodDescriptor.<imcPersonne.imcPersonneRequest, imcPersonne.imcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testHelloWorld"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  imcPersonne.imcPersonneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  imcPersonne.imcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new imcServiceMethodDescriptorSupplier("testHelloWorld"))
              .build();
        }
      }
    }
    return getTestHelloWorldMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static imcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<imcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<imcServiceStub>() {
        @java.lang.Override
        public imcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new imcServiceStub(channel, callOptions);
        }
      };
    return imcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static imcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<imcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<imcServiceBlockingStub>() {
        @java.lang.Override
        public imcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new imcServiceBlockingStub(channel, callOptions);
        }
      };
    return imcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static imcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<imcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<imcServiceFutureStub>() {
        @java.lang.Override
        public imcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new imcServiceFutureStub(channel, callOptions);
        }
      };
    return imcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class imcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void testHelloWorld(imcPersonne.imcPersonneRequest request,
        io.grpc.stub.StreamObserver<imcPersonne.imcResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestHelloWorldMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestHelloWorldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                imcPersonne.imcPersonneRequest,
                imcPersonne.imcResponse>(
                  this, METHODID_TEST_HELLO_WORLD)))
          .build();
    }
  }

  /**
   */
  public static final class imcServiceStub extends io.grpc.stub.AbstractAsyncStub<imcServiceStub> {
    private imcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected imcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new imcServiceStub(channel, callOptions);
    }

    /**
     */
    public void testHelloWorld(imcPersonne.imcPersonneRequest request,
        io.grpc.stub.StreamObserver<imcPersonne.imcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestHelloWorldMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class imcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<imcServiceBlockingStub> {
    private imcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected imcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new imcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public imcPersonne.imcResponse testHelloWorld(imcPersonne.imcPersonneRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestHelloWorldMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class imcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<imcServiceFutureStub> {
    private imcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected imcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new imcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<imcPersonne.imcResponse> testHelloWorld(
        imcPersonne.imcPersonneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestHelloWorldMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_HELLO_WORLD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final imcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(imcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_HELLO_WORLD:
          serviceImpl.testHelloWorld((imcPersonne.imcPersonneRequest) request,
              (io.grpc.stub.StreamObserver<imcPersonne.imcResponse>) responseObserver);
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

  private static abstract class imcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    imcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return imcPersonne.IMC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("imcService");
    }
  }

  private static final class imcServiceFileDescriptorSupplier
      extends imcServiceBaseDescriptorSupplier {
    imcServiceFileDescriptorSupplier() {}
  }

  private static final class imcServiceMethodDescriptorSupplier
      extends imcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    imcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (imcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new imcServiceFileDescriptorSupplier())
              .addMethod(getTestHelloWorldMethod())
              .build();
        }
      }
    }
    return result;
  }
}
