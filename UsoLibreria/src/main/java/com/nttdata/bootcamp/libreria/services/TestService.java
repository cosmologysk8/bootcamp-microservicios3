package com.nttdata.bootcamp.libreria.services;

import com.nttdata.bootcamp.libreria.Saludo;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String usoSaludo(String idioma){
        Saludo claseSaludo = new Saludo(idioma);

        return claseSaludo.mensajeSaludo();
    }

}
