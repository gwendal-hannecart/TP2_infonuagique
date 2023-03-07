import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
// sudo mvn protobuf:compile
//sudo mvn protobuf:compile-custom
// code dans /target/generated-sources/protobuf
// ajouter dans Projet structure les differents dossiers de generated-sources comme sources
public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8000).addService(new ServeurApps()).build();
        server.start();
        System.out.println("Serveur start");
        server.awaitTermination();
    }
}
