import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.logging.Logger;


public class Client {
    private static final Logger logger = Logger.getLogger(Client.class.getName());
    public static void main(String[] args) {
        System.out.println("Bonjour");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("grpc.stymi.fr", 50051).usePlaintext().build();// Création du canal de communication avec le serveur gRPC
        imcPersonne.imcServiceGrpc.imcServiceBlockingStub stub= imcPersonne.imcServiceGrpc.newBlockingStub(channel); // Création d'un stub, une classe générée automatiquement par gRPC à partir du fichier proto,qui permet d'appeler les méthodes définies dans le service distant
        imcPersonne.imcResponse reply = stub.iMCRequest(imcPersonne.imcPersonneRequest.newBuilder().setAge(45).setSize(14).setStrName("BonjourJava").setWeight(45).build());//Appel de la méthode distante "iMCRequest" à travers le stub en passant les arguments nécessaires
         System.out.println(reply.toString());// Affichage de la réponse retournée par le serveur
         channel.shutdown();// Fermeture du canal de communication
    }

}
