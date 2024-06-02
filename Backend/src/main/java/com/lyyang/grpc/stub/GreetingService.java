package com.lyyang.grpc.stub;

import com.lyyang.grpc.model.GreeterGrpc;
import com.lyyang.grpc.model.GreeterProto;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Iterator;

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

    public String serverSideStreamingGetListStockQuotes() {

        GreeterProto.Stock request = GreeterProto.Stock.newBuilder()
                .setTickerSymbol("AU")
                .setCompanyName("Austich")
                .setDescription("server streaming example")
                .build();
        StreamObserver<GreeterProto.StockQuote> stockQuotes;
        try {
            log.info("REQUEST - ticker symbol {}", request.getTickerSymbol());
            greeterStub.serverSideStreamingGetListStockQuotes(request, new StockQuoteCallback());

        } catch (StatusRuntimeException e) {
            log.info("RPC failed: {}", e.getStatus());
        }
        return "";
    }

}
