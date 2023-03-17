import imcPersonne.imcPersonneRequest;
import imcPersonne.imcResponse;
import io.grpc.stub.StreamObserver;

public class ServeurApps extends imcPersonne.imcServiceGrpc.imcServiceImplBase {
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
public String imcCalcul(float weight,float size){
    float imc=(weight)/(size*size);
    if(imc < 18.5){
        return "votre imc est : "+ imc+", il est inférieur à 18.5, vous êtes considèrez comme maigre";
    }
    if(imc >= 18.5 && imc < 25  ){
        return "votre imc est : "+ imc+", il estcompris entre 18.5 et 25, vous êtes considèrez comme étant de corpulence normal";
    }
    if( imc >= 25  ){
        return "votre imc est : "+ imc+", il estcompris entre 18.5 et 25, vous êtes considèrez comme étant en surpoids";
    }
    return "erreur";
}

    @Override
    public void iMCRequest(imcPersonneRequest request, StreamObserver<imcResponse> responseObserver) {
        String imc=imcCalcul(request.getWeight(),request.getSize());
        String display= new StringBuilder().append("Bonjour, Monsieur ").append(request.getStrName()).append("\n vous êtes agé de ").append(request.getAge()).append(", ayant une taille de ").append(request.getSize()).append(", et un poids de ").append(request.getWeight()).append("\n"+imc).toString();
        imcPersonne.imcResponse test= imcPersonne.imcResponse.newBuilder().setResponse(display).build();
        System.out.println(test.toString());
        responseObserver.onNext(test);
        responseObserver.onCompleted();
    }


}
