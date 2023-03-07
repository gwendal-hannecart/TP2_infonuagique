import io.grpc.Server;


public class ServeurApps extends TestHelloWorldServiceGrpc.TestHelloWorldServiceImplBase {
    private int port;



    private Server server;

    public int getPort() {
        return port;
    }

    public Server getServer() {
        return server;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setServer(Server server) {
        this.server = server;
    }
    public ServeurApps(int port, Server server) {
        super();

        this.port = port;
        this.server = server;
    }



}
