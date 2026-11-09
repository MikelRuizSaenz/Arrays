package ArraysCadenas;

public class Ejercicio11 {
    String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed", "Abba", "Abecedario"};

    // Función auxiliar para encontrar la cadena con más vocales.
    public String cadenaConMasVocales(String[] cadenas) {
        // Se guardan tres registros: el número de vocales en la cadena con más vocales, 
        // la cadena con más vocales y su posición en el array.
        int masVocales = 0;
        String cadena = "";
        int posicion = 0;
        
        // Se recorren las cadenas y por cada cadena se inicializa una variable
        // a 0 con el número de vocales que tenga
        for (int i = 0; i < cadenas.length; i++) {
            int vocales = 0;

            // Se recorren todos los caracteres de la cadena seleccionada.
            // Si el caracter es una vocal se suma uno al registro.
            for (int j = 0; j < cadenas[i].length(); j++) {
                char curr = cadenas[i].charAt(j);

                if (curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
                    vocales++;
                }
            }

            // Si tras revisar todos los caracteres de una cadena,
            // la cadena tiene más vocales que las cadenas anteriores,
            // se reasigna la variable que guarda el record de vocales con el número de vocales actual,
            // se reasgna la cadena anterior por la que ha roto el record de vocales y se guarda la posicion (i)
            // de la nueva cadena.
            if (vocales > masVocales) {
                masVocales = vocales;
                cadena = cadenas[i];
                posicion = i + 1;
            }
        }

        return cadena + " es la cadena con más vocales con un total de " + masVocales + " y esta en la posición número " + posicion + ".";
    }

    public void main(String[] args) {
        System.out.println(cadenaConMasVocales(cadenas));
    }
}