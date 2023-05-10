package com.nttdata.bootcamp.libreria;

public class ConvertidorTemperatura {

    private double temperatura;
    private String tempOrigen;
    private String tempDestino;

    public ConvertidorTemperatura(double temperatura, String tempOrigen, String tempDestino) {
        this.temperatura = temperatura;
        this.tempOrigen = tempOrigen;
        this.tempDestino = tempDestino;
    }

    public Double cambiarTemperaturaCelsiusAFahrenheit(Double temperatura) {
        return temperatura * 1.8 + 32;
    }

    public Double cambiarTemperaturaFahrenheitACelsius(Double temperatura) {
        return (temperatura - 32) / 1.8;
    }

    public String cambiarTemperatura(double temperatura, String tempOrigen, String tempDestino) {
        String mensaje = "";
        // Verificar si las unidades de origen y destino son iguales
        if (tempOrigen.equalsIgnoreCase(tempDestino)) {
            mensaje = "La temperatura de " + tempOrigen + " a " + tempDestino + " es: " + String.valueOf(temperatura);
            return mensaje;
        }

        if (tempOrigen.equalsIgnoreCase("Celsius")) {
            if (tempDestino.equalsIgnoreCase("Fahrenheit")) {
                mensaje = "La temperatura de Celsius a Fahrenheit es: " + String.valueOf(Math.round(((temperatura * 9/5) + 32) * 100.0)/100.0) + " ºF";
                return mensaje;
            }
        }

        if (tempOrigen.equalsIgnoreCase("Fahrenheit")) {
            if (tempDestino.equalsIgnoreCase("Celsius")) {
                mensaje = "La temperatura de Fahrenheit a Celsius es: " + String.valueOf(Math.round(((temperatura - 32) * 5/9) * 100.0) /100.0) + " ºC";
                return mensaje;
            }
        }

        mensaje = "La temperatura de " + tempOrigen + " a " + tempDestino + " no es válida";
        return mensaje;
    }

}
