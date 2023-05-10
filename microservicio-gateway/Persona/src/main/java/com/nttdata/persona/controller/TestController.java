package com.nttdata.persona.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/obtener")
    public String inventario(){
        return "persona";
    }

}
