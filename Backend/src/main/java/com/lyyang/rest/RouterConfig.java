package com.lyyang.rest;

import com.lyyang.filter.ExampleHandlerFilterFunction;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@RequiredArgsConstructor
@Configuration
public class RouterConfig {

    private final FunctionHandler functionHandler;

    private final IntervalHandler intervalHandler;

    private final ExampleHandlerFilterFunction exampleHandlerFilterFunction;

    private final GrpcHandler grpcHandler;

    @Bean
    public RouterFunction<ServerResponse> timerRouter() {
        return route(GET("fhello2"), functionHandler::getTime).filter(exampleHandlerFilterFunction);
    }

    @Bean
    public RouterFunction<ServerResponse> intervalRouter() {
        return route(GET("hello/{test}"), intervalHandler::getTimes)
                .andRoute(GET("fhello4"), intervalHandler::checkParameterRuntimeException)
                .andRoute(GET("fhello5"), intervalHandler::checkParameterCustomException)
                .andRoute(GET("api/hello"), grpcHandler::sayHello)
                .andRoute(GET("api/helloNonblocking"), grpcHandler::sayHelloNonblocking)
                .andRoute(GET("api/nonblocking"), grpcHandler::nonBlocking)
                ;
    }
}
