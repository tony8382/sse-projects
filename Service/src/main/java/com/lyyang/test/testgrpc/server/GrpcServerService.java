package com.lyyang.test.testgrpc.server;

import com.lyyang.test.testgrpc.model.GreeterGrpc;
import com.lyyang.test.testgrpc.model.GreeterProto;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class GrpcServerService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(GreeterProto.HelloRequest request, StreamObserver<GreeterProto.HelloReply> responseObserver) {

        GreeterProto.HelloReply reply = GreeterProto.HelloReply.newBuilder().setMessage("Hello User ==> " + request.getName()).build();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHelloAdmin(GreeterProto.HelloRequest request, StreamObserver<GreeterProto.HelloReply> responseObserver) {
        GreeterProto.HelloReply reply = GreeterProto.HelloReply.newBuilder().setMessage("Hello Admin ==> " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void serverSideStreamingGetListStockQuotes(GreeterProto.Stock request, StreamObserver<GreeterProto.StockQuote> responseObserver) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GreeterProto.StockQuote stockQuote = GreeterProto.StockQuote.newBuilder()
                    .setPrice((int) (Math.random() * (300)))
                    .setOfferNumber(i)
                    .setDescription("Price for stock:" + request.getTickerSymbol())
                    .build();
            responseObserver.onNext(stockQuote);
        }
        responseObserver.onCompleted();
    }
}
