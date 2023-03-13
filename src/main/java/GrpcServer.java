import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.ServerCredentials;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

// sudo mvn protobuf:compile
//sudo mvn protobuf:compile-custom
// code dans /target/generated-sources/protobuf
// ajouter dans Projet structure les differents dossiers de generated-sources comme sources
public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server;
        SocketAddress address = new InetSocketAddress("172.19.141.250", 8080);
        server =  NettyServerBuilder.forAddress(address).addService(new ServeurApps()).build();
        server.start();
        System.out.println("Serveur start");
        server.awaitTermination();
    }
}
