package com.nttdata.gateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class Filter {

    Logger log = LoggerFactory.getLogger(getClass());

    @Bean
    @Order(-1)
    public GlobalFilter filterA(){
        return (exchange, chain) -> {
          log.info("Primer pre filter");
          return chain.filter(exchange).then(Mono.fromRunnable(
                  () -> {
                      log.info("Primer Post Filter");
                  }
          ));
        };
    }

    @Bean
    @Order(0)
    public GlobalFilter filterB(){
        return (exchange, chain) -> {
            log.info("Segundo pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(
                    () -> {
                        log.info("Segundo Post Filter");
                    }
            ));
        };
    }

    @Bean
    @Order(1)
    public GlobalFilter filterC(){
        return (exchange, chain) -> {
            log.info("Tercer pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(
                    () -> {
                        log.info("Tercer Post Filter");
                    }
            ));
        };
    }


}
