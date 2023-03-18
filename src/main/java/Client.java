import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.logging.Logger;


public class Client {
    private static final Logger logger = Logger.getLogger(Client.class.getName());
    public static void main(String[] args) {
        System.out.println("Bonjour");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("grpc.stymi.fr", 50051).usePlaintext().build();
        imcPersonne.imcServiceGrpc.imcServiceBlockingStub stub= imcPersonne.imcServiceGrpc.newBlockingStub(channel);
        imcPersonne.imcResponse reply = stub.iMCRequest(imcPersonne.imcPersonneRequest.newBuilder().setAge(45).setSize(14).setStrName("BonjourJava").setWeight(45).build());
         System.out.println(reply.toString());
         channel.shutdown();
    }

}
