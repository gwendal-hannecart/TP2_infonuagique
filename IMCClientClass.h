#ifndef TESTGRCP_IMCClientClass_H
#define TESTGRCP_IMCClientClass_H

// - Includes Declaration - //
#include <grpcpp/grpcpp.h>
#include "proto/IMC.grpc.pb.h"
#include "proto/IMC.pb.h"
#include <string>
#include <iostream>

// - NameSpaces Declaration - //
using grpc::Channel;
using grpc::ClientContext;
using grpc::Status;
using std::cout;


class IMCClientClass {
private:
    std::unique_ptr<imcPersonne::imcService::Stub> stub_; // Ptr indiquant le channel ( adresse du serveur et sécurité d'envoie )
public:
    explicit IMCClientClass(std::shared_ptr<Channel> channel); // Constructeur
    std::string sendRequest(const std::string& name, const std::int32_t& age, const float& size, const float& weight); // Fonction d'envoie de la requête
};

#endif //TESTGRCP_IMCClientClass_H
