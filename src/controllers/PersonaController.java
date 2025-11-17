package controllers;

import models.Persona;

public class PersonaController {

    

    public Persona findByName(Persona[] personas, String objetivo){
        
        for (int i = 0; i < personas.length; i++) {                                              
                                                               
            int pos = i;                                                                                          
            for (int j = i+1; j < personas.length; j++) {                                       
                if (personas[j].getNombre().compareToIgnoreCase(personas[pos].getNombre()) < 0) {           

                                                                 
                    pos = j;
                }


            }
            if (pos != i) {                                                                       
                Persona temp = personas[i];
                personas[i] = personas[pos];
                personas[pos] = temp;
            }
        }

        int izquierda = 0;
        int derecha = personas.length-1;

        while (izquierda<=derecha) {
            int medio = izquierda + (derecha-izquierda) / 2;
            int comparacion=personas[medio].getNombre().compareTo(objetivo);
            //1ro validamos 
            if (comparacion == 0) {
                return personas[medio];

            } else if (comparacion< 0) {
                
                izquierda = medio +1;
            } else {
                derecha = medio -1;
            }
        }
        return null;

        
    }
}
