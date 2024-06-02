package com.lyyang.rest;

import com.lyyang.grpc.stub.GreetingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Service
@Slf4j
@RequiredArgsConstructor
public class GrpcHandler {

    private final GreetingService greetingService;

    public Mono<ServerResponse> sayHello(ServerRequest serverRequest) {

        return ok().contentType(MediaType.TEXT_PLAIN)
                .body(Mono.just(greetingService.sayHello(serverRequest.queryParam("name").orElse("NULL"))), String.class);
    }

    public Mono<ServerResponse> blocking(ServerRequest serverRequest) {
        return ok().contentType(MediaType.TEXT_EVENT_STREAM)
                .body(Mono.just(greetingService.serverSideStreamingGetListStockQuotes()), String.class);

    }
}
