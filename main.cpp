
#include <grpcpp/grpcpp.h>
#include "proto/IMC.grpc.pb.h"
#include "proto/IMC.pb.h"
#include <string>



using grpc::Channel;
using grpc::ClientContext;
using grpc::Status;
using std::cout;
//using testHelloWorld::HelloWorld;
//using testHelloWorld::HelloResponse;
//using testHelloWorld::TestHelloWorldService;

/*intall on debain
 * sudo apt install libgrpc++-dev
 * sudo apt install protobuf-compiler
 *sudo apt install libgrpc-dev
 *  sudo apt install  protobuf-compiler-grpc
 * sudo apt install
 *  sudo apt-get install  libgrpc++1
 * protoc -I=proto/ --grpc_out=proto/ --plugin=protoc-gen-grpc=`which grpc_cpp_plugin` proto/IMC.proto
 * protoc -I=proto/ --cpp_out=proto/ proto/IMC.proto
 * copier-coller les différents fichiers du dossier .proto dans le dossier du main
 * */

class HelloWorldClient {
private:
    std::unique_ptr<imcPersonne::imcService::Stub> stub_;
public:
    HelloWorldClient(std::shared_ptr<Channel> channel) : stub_(imcPersonne::imcService::NewStub(channel)) {

    }

   std::string sendRequest(std::string name, std::int32_t age, float size, float weight) {
        imcPersonne::imcPersonneRequest request;
        request.set_strname("TestC++");
        request.set_age(age);
        request.set_size(size);
        request.set_weight(weight);
        imcPersonne::imcResponse reply;
        ClientContext context;
        Status status = stub_->IMCRequest(&context,request,&reply);
        if (status.ok()) {
            return reply.response();
        } else {
            std::cout << status.error_code() << ": " << status.error_message() << std::endl;
            return "erreur";
        }
    }


};

void Run();

int main() {
    //std::cout << "Hello, World!" << std::endl;
//    Channel channel = grpc::Channel(__cxx11::basic_string(), nullptr, std::vector());
    Run();

    return 0;
}

void Run() {
    std::string address("grpc.stymi.fr:50051");
  //  std::string address("192.168.2.120:8000");
    HelloWorldClient client(
            grpc::CreateChannel(
                    address,
                    grpc::InsecureChannelCredentials()
            )
    );

    std::string response;
    std::string name= "nameC++";
    std::int32_t age=40;
    float size=1.70;
    float weigth=45;
    while(1) {
        response = client.sendRequest(name, age, size, weigth);
        std::cout << "Answer received: " << response << std::endl;
    }
}


