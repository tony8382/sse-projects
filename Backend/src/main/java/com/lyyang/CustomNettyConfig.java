package com.lyyang;

import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.netty.resources.LoopResources;

@Configuration
public class CustomNettyConfig {

    @Bean
    public NettyReactiveWebServerFactory nettyReactiveWebServerFactory() {
        NettyReactiveWebServerFactory factory = new NettyReactiveWebServerFactory();
        factory.addServerCustomizers(httpServer -> {
            LoopResources loopResources = LoopResources.create("custom-http", 100, true);
            return httpServer.runOn(loopResources);
        });
        return factory;
    }
}