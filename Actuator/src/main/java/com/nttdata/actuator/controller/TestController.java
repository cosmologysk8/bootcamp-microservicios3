package com.nttdata.actuator.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private Counter counter;

    public TestController(MeterRegistry registry){
        this.counter = Counter.builder("invocaciones.hello")
                .description("Invocaciones totales del endpoint hello")
                .register(registry);
    }

    @GetMapping("/hello")
    public String saludo(){
        counter.increment();
        return "Hola";
    }

}
