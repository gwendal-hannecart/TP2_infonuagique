
#include <grpcpp/grpcpp.h>
#include "proto/test.pb.h"
#include "proto/test.grpc.pb.h"
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
 * protoc -I=proto/ --grpc_out=proto/ --plugin=protoc-gen-grpc=`which grpc_cpp_plugin` proto/test.proto
 * protoc -I=proto/ --cpp_out=proto/ proto/test.proto
 * copier-coller les différents fichiers du dossier .proto dans le dossier du main
 * */

class HelloWorldClient {
public:
    HelloWorldClient(std::shared_ptr<Channel> channel) : stub_(TestHelloWorldService::NewStub(channel)) {

    }

   std::string sendRequest(std::string name, std::int32_t age, float size, float weight) {
        HelloWorld request;
        request.set_strhello("TestC++");
        request.set_age(age);
        request.set_size(size);
        request.set_weight(weight);
        HelloResponse reply;
        ClientContext context;
        Status status = stub_->testHelloWorld(&context,request,&reply);
        if (status.ok()) {
            return reply.response();
        } else {
            std::cout << status.error_code() << ": " << status.error_message() << std::endl;
            return "erreur";
        }
    }

private:
    std::unique_ptr<TestHelloWorldService::Stub> stub_;
};

void Run();

int main() {
    //std::cout << "Hello, World!" << std::endl;
//    Channel channel = grpc::Channel(__cxx11::basic_string(), nullptr, std::vector());
    Run();

    return 0;
}

void Run() {
    std::string address("172.19.131.59:8080");
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


