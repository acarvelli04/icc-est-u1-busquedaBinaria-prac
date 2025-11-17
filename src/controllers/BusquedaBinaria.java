package controllers;



public class BusquedaBinaria {

    
    
    public Integer busquedaNumero(int[] arr, int valor){

        for (int i = 0; i < arr.length; i++) {                                              
                                                               
            int pos = i;                                                                                          
            for (int j = i+1; j < arr.length; j++) {                                       
                if (arr[j]<arr[pos])  {           

                                                                 
                    pos = j;
                }


            }
            if (pos != i) {                                                                       
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
            }
        }

        int izquierda = 0;
        int derecha = arr.length-1;

        while (izquierda<=derecha) {
            int medio = izquierda + (derecha-izquierda) / 2;
            //1ro validamos 
            if (arr[medio]==valor) {
                return arr[medio];

            } else if (arr[medio]< valor) {
                
                izquierda = medio +1;
            } else {
                derecha = medio -1;
            }
        }
        return null;
    }
        
    /** 
    public Integer busquedaBinaria(Persona[] personas, String objetivo){
        int izquierda = 0;
        int derecha = personas.length-1;

        while (izquierda<=derecha) {
            int medio = izquierda + (derecha-izquierda) / 2;
            int comparacion=personas[medio].getNombre().compareTo(objetivo);
            //1ro validamos 
            if (comparacion == 0) {
                return medio;

            } else if (comparacion< 0) {
                
                izquierda = medio +1;
            } else {
                derecha = medio -1;
            }
        }
        return null;

        
    }
        */
}
