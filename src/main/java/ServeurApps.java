import imcPersonne.imcPersonneRequest;
import imcPersonne.imcResponse;
import io.grpc.stub.StreamObserver;

public class ServeurApps extends imcPersonne.imcServiceGrpc.imcServiceImplBase {
public String imcCalcul(float weight,float size){//Fonction de calcul de l'imc d'une personne
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
    public void iMCRequest(imcPersonneRequest request, StreamObserver<imcResponse> responseObserver) {//Implémentation gRPC pour calcul de l'imc
        String imc=imcCalcul(request.getWeight(),request.getSize());//Calcul de l'imc
        String display= new StringBuilder().append("Bonjour, Monsieur ").append(request.getStrName()).append("\n vous êtes agé de ").append(request.getAge()).append(", ayant une taille de ").append(request.getSize()).append(", et un poids de ").append(request.getWeight()).append("\n"+imc).toString();//Chaine de caractère pour affichage résultat
        imcPersonne.imcResponse test= imcPersonne.imcResponse.newBuilder().setResponse(display).build();//creation de l'objet pour envoi de la réponse
        System.out.println(test.toString());//Affichage de la réponse
        responseObserver.onNext(test);//Envoi au client
        responseObserver.onCompleted();//Traitement terminé
    }


}
