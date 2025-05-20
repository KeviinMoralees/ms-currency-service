package com.cocoder.handler;

import org.springframework.boot.autoconfigure.rsocket.RSocketProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CurrencyHandler {

    public Mono<ServerResponse> convertCurrency(ServerRequest request) {
       return ServerResponse.ok().bodyValue("Eres el mejor");
    }
}
