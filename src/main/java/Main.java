import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

// sudo mvn protobuf:compile
//sudo mvn protobuf:compile-custom
// code dans /target/generated-sources/protobuf
// ajouter dans Projet structure les differents dossiers de generated-sources comme sources
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server;
        SocketAddress address = new InetSocketAddress("192.168.0.65",  50051);//Cree adresse de socket en utilisant l'ip et le numéro de port
      //  SocketAddress address = new InetSocketAddress("192.168.2.120",  8000);
        server =  NettyServerBuilder.forAddress(address).addService(new ServeurApps()).build();//cree le serveur gRPC en utilisant adresse socket
        server.start();//démarre le serveur
        System.out.println("Serveur start");//Affiche "serveur start" quand le serveur à démarré"
        server.awaitTermination(); //Arrete le serveur gRPC quand le programme se termine
    }
}
