package views;

import models.Persona;

public class ShowConsole {
    public void showResult(int result, int valorBuscado){
        if (result == -1) {
            System.out.println("Se encontro "+ valorBuscado);
        } else {
            System.out.println("No se encontro" + valorBuscado);
            
        }
    }

    public void PersonshowResult(Persona persona, String nombreBuscado){
        if (persona==null) {
            System.out.println("La persona "+ nombreBuscado + "no se ha encontrado");
        } else {
            System.out.println("La persona "+ nombreBuscado + " se ha encontrado");
        }
    }
}

