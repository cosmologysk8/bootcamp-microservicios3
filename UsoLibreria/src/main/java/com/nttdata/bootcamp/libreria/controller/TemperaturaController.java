package com.nttdata.bootcamp.libreria.controller;

import com.nttdata.bootcamp.libreria.services.TemperaturaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TemperaturaController {

    TemperaturaService temperaturaService;

    public TemperaturaController(TemperaturaService temperaturaService) {
        this.temperaturaService = temperaturaService;
    }

    @GetMapping(value = "/temperatura/{grados}/{tempOrigen}/{tempDestino}")
    public String convertirTemperatura(@PathVariable double grados,@PathVariable String tempOrigen,@PathVariable String tempDestino) {
        return temperaturaService.convertidorTemperatura(grados, tempOrigen, tempDestino);
    }

}
