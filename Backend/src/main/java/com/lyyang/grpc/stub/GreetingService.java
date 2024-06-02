package com.lyyang.grpc.stub;

import com.lyyang.grpc.model.GreeterGrpc;
import com.lyyang.grpc.model.GreeterProto;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
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

    public Flux<Double> getStreamMessages() {
        GreeterProto.Stock request = GreeterProto.Stock.newBuilder()
                .setTickerSymbol("AU")
                .setCompanyName("Austich")
                .setDescription("server streaming example")
                .build();

        return Flux.create(sink -> {
            StreamObserver<GreeterProto.StockQuote> responseObserver = new StreamObserver<GreeterProto.StockQuote>() {
                @Override
                public void onNext(GreeterProto.StockQuote stockQuote) {
                    sink.next(stockQuote.getPrice());
                }

                @Override
                public void onError(Throwable t) {
                    sink.error(t);
                }

                @Override
                public void onCompleted() {
                    sink.complete();
                }
            };

            greeterStub.serverSideStreamingGetListStockQuotes(request, responseObserver);
        });
    }


}
