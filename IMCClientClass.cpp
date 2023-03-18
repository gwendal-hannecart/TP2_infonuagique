#include "IMCClientClass.h"

IMCClientClass::IMCClientClass(std::shared_ptr<Channel> channel) : stub_(imcPersonne::imcService::NewStub(channel)){}

std::string IMCClientClass::sendRequest(const std::string& name, const std::int32_t& age, const float& size, const float& weight) {
    // - Variables Declarations - //
    imcPersonne::imcPersonneRequest request;
    imcPersonne::imcResponse reply;
    ClientContext context;
    Status status;

    // - Request fillment - //
    request.set_strname(name);
    request.set_age(age);
    request.set_size(size);
    request.set_weight(weight);

    status = this->stub_->IMCRequest(&context,request,&reply); // Envoie de la requête au serveur JAVA

    if(status.ok()){ // Récupération du status de la requête
        return reply.response();
    }else{
        std::cerr << status.error_code() << ": " << status.error_message() << std::endl;
        return "-1";
    }
}