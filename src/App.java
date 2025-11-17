import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {

    public static void main(String[] args) throws Exception {

        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        PersonaController pC = new PersonaController();

        // --------------------
        // BUSQUEDA NUMÉRICA
        // --------------------

        int[] arr = new int[] {10, 2, 4, 6, 7, 8, 13, 20};

        Integer indice = bB.busquedaNumero(arr, 10);
        sC.showResult(indice, 10);

        // --------------------
        // BUSQUEDA PERSONAS
        // --------------------

        Persona[] people = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Pedro", 20),
            new Persona("Maria", 28),
            new Persona("Luis", 22),
            new Persona("Carmen", 27),
            new Persona("Sofia", 24),
        };

        Persona buscado = pC.findByName(people, "Juan");

        sC.showPersonResult(buscado, "Juan");
    }
}
