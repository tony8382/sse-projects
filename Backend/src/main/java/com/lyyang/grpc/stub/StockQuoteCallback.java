package com.lyyang.grpc.stub;

import com.lyyang.grpc.model.GreeterProto;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockQuoteCallback implements StreamObserver<GreeterProto.StockQuote> {
    @Override
    public void onNext(GreeterProto.StockQuote stockQuote) {
        log.info("Received product, {}", stockQuote.getPrice());

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

    }
}
