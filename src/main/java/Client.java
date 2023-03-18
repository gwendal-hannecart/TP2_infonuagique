import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.logging.Logger;


public class Client {
    private static final Logger logger = Logger.getLogger(Client.class.getName());
    public static void main(String[] args) {
        System.out.println("Bonjour");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("grpc.stymi.fr", 50051).usePlaintext().build();
        imcServiceGrpc.imcServiceBlockingStub stub= imcServiceGrpc.newBlockingStub(channel);
        imcResponse reply = stub.iMCRequest(imcPersonneRequest.newBuilder().setAge(45).setSize(14).setStrName("BonjourJava").setWeight(45).build());
         System.out.println(reply.toString());
         channel.shutdown();
    }

}
