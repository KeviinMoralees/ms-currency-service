package com.cocoder;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class CurrencyCoverterUseCase {

   public Mono<Currency> convert(Currency currency) {
       return Mono.just(currency);
   }

   private Mono<Currency> USDToCOP(Currency currency) {
       return Mono.just(currency);
   }

   private Mono<Currency> COPToUSD(Currency currency) {
       return Mono.just(currency);
   }

}
