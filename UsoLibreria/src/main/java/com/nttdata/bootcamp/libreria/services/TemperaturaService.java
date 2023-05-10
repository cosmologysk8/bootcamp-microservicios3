package com.nttdata.bootcamp.libreria.services;

import com.nttdata.bootcamp.libreria.ConvertidorTemperatura;
import org.springframework.stereotype.Service;

@Service
public class TemperaturaService {

    public String convertidorTemperatura(double temperatura, String tempOrigen, String tempDestino){
        ConvertidorTemperatura convertidorTemperatura = new ConvertidorTemperatura(temperatura, tempOrigen, tempDestino);
        return convertidorTemperatura.cambiarTemperatura(temperatura, tempOrigen, tempDestino);
    }

}
