#include "IMCClientClass.h"

#define ADDRESS "grpc.stymi.fr:50051"

void Run();

int main() {
    Run();
    return 0;
}

void Run() {
    IMCClientClass client(grpc::CreateChannel(ADDRESS,grpc::InsecureChannelCredentials())); // Création du client

    // - Déclaration des variables - //
    std::string response;
    std::string name;
    std::int32_t age;
    float size;
    float weigth;
    bool on = true;
    char continueVal;

    // - Boucle infinie de fonctionnement - //
    while(on){

        // - Récolte des données utilisateur - //

        std::cout << "Entrez les informations nécessaires suivante au calcul de l'IMC par le serveur gRPC :" << std::endl;
        do{
            std::cout << "Votre nom : ";
            std::cin >> name;
        }while(name.length() < 1);
        do{
            std::cout << "Votre age : ";
            std::cin >> age;
        }while(age < 0 || age > 500);
        do{
            std::cout << "Votre taille : ";
            std::cin >> size;
        }while(size < 1.0 || size > 5.0);
        do{
            std::cout << "Votre masse : ";
            std::cin >> weigth;
        }while(weigth < 1.0 || weigth > 1000.0);

        // - Envoie des données au serveur et réception de la réponse - //

        std::cout << "Toutes vos informations sont entrées correctement, Envoie des données ..." << std::endl;
        response = client.sendRequest(name, age, size, weigth);
        std::cout << "Réponse reçue du serveur : " << response << std::endl << std::endl;

        // - Choix de continuer - //

        std::cout << "Voulez-vous continuer ou quitter ? (C/q)";
        std::cin >> continueVal;

        if(continueVal != 'C' && continueVal != 'c'){ // Si on ne continue pas, peut importe la lettre on arrête
            on = false; // On arrête la boucle infinie
        }
    }
}