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
    comments = "Source: test.proto")
public final class TestHelloWorldServiceGrpc {

  private TestHelloWorldServiceGrpc() {}

  public static final String SERVICE_NAME = "TestHelloWorldService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HelloWorld,
      HelloResponse> getTestHelloWorldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testHelloWorld",
      requestType = HelloWorld.class,
      responseType = HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HelloWorld,
      HelloResponse> getTestHelloWorldMethod() {
    io.grpc.MethodDescriptor<HelloWorld, HelloResponse> getTestHelloWorldMethod;
    if ((getTestHelloWorldMethod = TestHelloWorldServiceGrpc.getTestHelloWorldMethod) == null) {
      synchronized (TestHelloWorldServiceGrpc.class) {
        if ((getTestHelloWorldMethod = TestHelloWorldServiceGrpc.getTestHelloWorldMethod) == null) {
          TestHelloWorldServiceGrpc.getTestHelloWorldMethod = getTestHelloWorldMethod =
              io.grpc.MethodDescriptor.<HelloWorld, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testHelloWorld"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloWorld.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestHelloWorldServiceMethodDescriptorSupplier("testHelloWorld"))
              .build();
        }
      }
    }
    return getTestHelloWorldMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestHelloWorldServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestHelloWorldServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestHelloWorldServiceStub>() {
        @java.lang.Override
        public TestHelloWorldServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestHelloWorldServiceStub(channel, callOptions);
        }
      };
    return TestHelloWorldServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestHelloWorldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestHelloWorldServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestHelloWorldServiceBlockingStub>() {
        @java.lang.Override
        public TestHelloWorldServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestHelloWorldServiceBlockingStub(channel, callOptions);
        }
      };
    return TestHelloWorldServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestHelloWorldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestHelloWorldServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestHelloWorldServiceFutureStub>() {
        @java.lang.Override
        public TestHelloWorldServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestHelloWorldServiceFutureStub(channel, callOptions);
        }
      };
    return TestHelloWorldServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestHelloWorldServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void testHelloWorld(HelloWorld request,
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestHelloWorldMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestHelloWorldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HelloWorld,
                HelloResponse>(
                  this, METHODID_TEST_HELLO_WORLD)))
          .build();
    }
  }

  /**
   */
  public static final class TestHelloWorldServiceStub extends io.grpc.stub.AbstractAsyncStub<TestHelloWorldServiceStub> {
    private TestHelloWorldServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestHelloWorldServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestHelloWorldServiceStub(channel, callOptions);
    }

    /**
     */
    public void testHelloWorld(HelloWorld request,
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestHelloWorldMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestHelloWorldServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestHelloWorldServiceBlockingStub> {
    private TestHelloWorldServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestHelloWorldServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestHelloWorldServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public HelloResponse testHelloWorld(HelloWorld request) {
      return blockingUnaryCall(
          getChannel(), getTestHelloWorldMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestHelloWorldServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TestHelloWorldServiceFutureStub> {
    private TestHelloWorldServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestHelloWorldServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestHelloWorldServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloResponse> testHelloWorld(
        HelloWorld request) {
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
    private final TestHelloWorldServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestHelloWorldServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_HELLO_WORLD:
          serviceImpl.testHelloWorld((HelloWorld) request,
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
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

  private static abstract class TestHelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestHelloWorldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Test.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestHelloWorldService");
    }
  }

  private static final class TestHelloWorldServiceFileDescriptorSupplier
      extends TestHelloWorldServiceBaseDescriptorSupplier {
    TestHelloWorldServiceFileDescriptorSupplier() {}
  }

  private static final class TestHelloWorldServiceMethodDescriptorSupplier
      extends TestHelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestHelloWorldServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestHelloWorldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestHelloWorldServiceFileDescriptorSupplier())
              .addMethod(getTestHelloWorldMethod())
              .build();
        }
      }
    }
    return result;
  }
}
