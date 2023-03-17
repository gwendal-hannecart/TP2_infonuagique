cmake_minimum_required(VERSION 3.18)
project(testgrcp)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_FLAGS "-fPIC   ")
#ajout de merde
find_path(PROTOBUF_INCLUDE_DIR google/protobuf/service.h)

find_library(PROTOBUF_LIBRARY NAMES protobuf)

find_path(GRPC_INCLUDE_DIR grpc/grpc.h)

find_library(GRPC_GRPC++_LIBRARY NAMES grpc++)

find_library(GRPC_GRPC++_REFLECTION_LIBRARY NAMES grpc++_reflection)



add_executable(testgrcp main.cpp proto/IMC.pb.h proto/IMC.pb.cc proto/IMC.grpc.pb.h proto/IMC.grpc.pb.cc IMCClientClass.cpp IMCClientClass.h)

target_link_libraries(testgrcp ${GRPC_GRPC++_REFLECTION_LIBRARY} ${GRPC_GRPC++_LIBRARY} ${PROTOBUF_LIBRARY} )