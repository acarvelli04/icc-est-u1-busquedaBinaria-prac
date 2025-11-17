package views;

import models.Persona;

public class ShowConsole {

    public void showResult(int resultado, int valorBuscado) {
    if (resultado != -1) {
        System.out.println("El número " + valorBuscado +" fue encontrado");
    } else {
        System.out.println("El número " + valorBuscado + " NO fue encontrado.");
    }
}


    public void showPersonResult(Persona persona, String nombreBuscado) {
        if (persona != null) {
            System.out.println("Persona encontrada:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } else {
            System.out.println("No existe una persona con el nombre: " + nombreBuscado);
        }
    }
}