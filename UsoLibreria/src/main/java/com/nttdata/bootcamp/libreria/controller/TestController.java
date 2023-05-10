package com.nttdata.bootcamp.libreria.controller;

import com.nttdata.bootcamp.libreria.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping(value = "/saludo/{idioma}")
    public String saludo(@PathVariable("idioma")String idioma){
       String saludoEnIdioma = service.usoSaludo(idioma);
       return saludoEnIdioma;
    }

}
