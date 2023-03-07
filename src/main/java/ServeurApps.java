import io.grpc.stub.StreamObserver;


public class ServeurApps extends TestHelloWorldServiceGrpc.TestHelloWorldServiceImplBase {
    //private int port;



    //private Server server;

   /* public int getPort() {
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
    }*/

@Override
    public void testHelloWorld(HelloWorld request, StreamObserver<HelloResponse> responseObserver) {
    //    super.testHelloWorld(request, responseObserver);
        String display= new StringBuilder().append("name").append(request.getStrHello()).append("age").append(request.getAge()).append("size").append(request.getSize()).append(request.getWeight()).toString();
        HelloResponse test= HelloResponse.newBuilder().setResponse(display).build();
        System.out.println(test.toString());
        responseObserver.onNext(test);
        responseObserver.onCompleted();
    }
}
