package com.lyyang.grpc.stub;

import com.lyyang.grpc.model.GreeterGrpc;
import com.lyyang.grpc.model.GreeterProto;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @GrpcClient("local-grpc-server")
    private GreeterGrpc.GreeterBlockingStub greeterStub;

    public String sayHello(String name) {
        GreeterProto.HelloReply reply = greeterStub.sayHello(GreeterProto.HelloRequest.newBuilder().setName(name).build());
        return reply.getMessage();
    }

    public String sayHelloAdmin(String name) {
        GreeterProto.HelloReply reply = greeterStub.sayHelloAdmin(GreeterProto.HelloRequest.newBuilder().setName(name).build());
        return reply.getMessage();
    }

}
