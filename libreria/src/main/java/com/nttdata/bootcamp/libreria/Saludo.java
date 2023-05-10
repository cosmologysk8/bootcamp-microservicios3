package com.nttdata.bootcamp.libreria;

public class Saludo {

    private String idioma;

    public Saludo(String idioma) {
        this.idioma = idioma;
    }

    public String mensajeSaludo(){
        String mensaje = "";
        switch (idioma) {
            case "es":
                mensaje = "Hola";
                break;
            case "en":
                mensaje = "Hello";
                break;
            case "fr":
                mensaje = "Bonjour";
                break;
            default:
                mensaje = "Hola";
                break;
        }
        return mensaje;
    }

}
