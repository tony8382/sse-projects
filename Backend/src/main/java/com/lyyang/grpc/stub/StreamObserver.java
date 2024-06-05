package com.lyyang.grpc.stub;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.MonoSink;

@Slf4j
public class StreamObserver<T> implements io.grpc.stub.StreamObserver<T> {
    private final MonoSink<T> sink;

    public StreamObserver(MonoSink<T> sink) {
        this.sink = sink;
    }

    @Override
    public void onNext(T t) {
        sink.success(t);
    }

    @Override
    public void onError(Throwable t) {
        sink.error(t);
    }

    @Override
    public void onCompleted() {
    }


}