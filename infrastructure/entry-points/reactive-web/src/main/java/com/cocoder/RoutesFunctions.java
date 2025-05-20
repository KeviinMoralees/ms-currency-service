package com.cocoder;

import com.cocoder.handler.CurrencyHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RoutesFunctions {

    @Bean
    public RouterFunction<ServerResponse> routes(CurrencyHandler handler) {
        return RouterFunctions.route()
                .path("/api/currency", builder -> builder
                .POST("", handler::convertCurrency)
                )
                .build();
    }

}
