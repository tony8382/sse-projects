package com.lyyang.grpc.stub;

import com.lyyang.grpc.model.GreeterGrpc;
import com.lyyang.grpc.model.GreeterProto;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Slf4j
@Service
public class GreetingService {

    @GrpcClient("local-grpc-server")
    private GreeterGrpc.GreeterBlockingStub greeterBlockingStub;

    @GrpcClient("local-grpc-server")
    private GreeterGrpc.GreeterStub greeterStub;

    public String sayHello(String name) {
        GreeterProto.HelloReply reply = greeterBlockingStub.sayHello(GreeterProto.HelloRequest.newBuilder().setName(name).build());
        return reply.getMessage();
    }

    public Flux<ServerSentEvent<String>> getStreamMessages() {
        GreeterProto.Stock request = GreeterProto.Stock.newBuilder()
                .setTickerSymbol("AU")
                .setCompanyName("Austich")
                .setDescription("server streaming example")
                .build();

        Flux<Double> r = Flux.create(sink -> greeterStub.serverSideStreamingGetListStockQuotes(request, new StockQuoteStreamObserver(sink)));

        return r.map(i -> ServerSentEvent.<String>builder()
                .event("message")
                .data("AAA" + i)
                .build());
    }


}
