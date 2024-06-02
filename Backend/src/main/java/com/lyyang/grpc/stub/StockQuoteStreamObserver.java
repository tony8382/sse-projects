package com.lyyang.grpc.stub;

import com.lyyang.grpc.model.GreeterProto;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.FluxSink;

@Slf4j
public class StockQuoteStreamObserver implements StreamObserver<GreeterProto.StockQuote> {
    private final FluxSink<Double> sink;

    public StockQuoteStreamObserver(FluxSink<Double> sink) {
        this.sink = sink;
    }

    @Override
    public void onNext(GreeterProto.StockQuote stockQuote) {
        sink.next(
                stockQuote.getPrice()
        );
    }

    @Override
    public void onError(Throwable t) {
        sink.error(t);
    }

    @Override
    public void onCompleted() {
        sink.complete();
    }
}