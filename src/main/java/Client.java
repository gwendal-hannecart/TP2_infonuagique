import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;



public class Client {

    public static void main(String[] args) {
        System.out.println("Bonjour");
      // HelloWorld test= HelloWorld.newBuilder().setAge(14).setSize(14).setStrHello("Bonjour").setWeight(45).build();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).usePlaintext().build();
        TestHelloWorldServiceGrpc.TestHelloWorldServiceBlockingStub stub =  TestHelloWorldServiceGrpc.newBlockingStub(channel);
       // StreamObserver<HelloWorld> responseObserver = new StreamObserver<HelloWorld>();
        HelloResponse hello = stub.testHelloWorld(HelloWorld.newBuilder().setAge(14).setSize(14).setStrHello("Bonjour").setWeight(45).build());
        System.out.println(hello.toString());
        channel.shutdown();
    }

}
