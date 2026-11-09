package ArraysCadenas;

public class Ejercicio7 {
    String[] cadenas = {"Sue", "Charlotte", "Anzarna", "Mike", "William", "Ed", "Zar"};

    // Función auxiliar para verificar si una cadena contiene una subcadena, "zar" en este caso.
    public boolean incluyeZar(String cadena, String subCadena) {
        // Guarda el largo de la subcadena
        int subCadenaMasLarga = subCadena.length();

        // Convierte la cadena y subcadena a minúsculas para poder analizarlas sin problemas de case-sensitive.
        cadena = cadena.toLowerCase();
        subCadena = subCadena.toLowerCase();

        // Recorre todas las cadenas
        for (int i = 0; i < cadena.length() - 1; i++) {
            // Si el caracter actual es igual al caracter inical de la subcadena,
            // inicializa una variable en 1 que servira como un indicador de la posición actual de la subcadena
            // y avanza una posición en el bucle.
            if (cadena.toLowerCase().charAt(i) == subCadena.charAt(0)) {
                int siguiente = 1;
                i++;

                // Mientras el caracter actual de la cadena coincida con el caracter actual de la subcadena y
                // la variable que lleva la posición de la subcadena (siguiente) sea menor o igual al largo de la subacadena
                // Continua avanzando posiciones tanto de la cadena como de la subcadena.
                // Si en algun momento el caracter actual es igual al último caracter de la subcadena, devuleve verdadero.
                while (cadena.charAt(i) == subCadena.charAt(siguiente) && siguiente <= subCadenaMasLarga) {
                    if (subCadena.charAt(subCadenaMasLarga - 1) == cadena.charAt(i)) {
                        return true;
                    }

                    i++;
                    siguiente++;
                }
            }
        }

        // Si se revisa la cadena y no contiene la subcadena, devuelve false.
        return false;
    }

    public void main(String[] args) {
        // Inicializa una variable que lleva un conteo de cuantas cadenas tienen una subcadena ("zar").
        int contador = 0;

        // Pasa todos los strings del array por la función auxiliar
        for (String string : cadenas) {
            // Si devulve true la subcadena suma uno a la variable.
            if (incluyeZar(string, "zar") == true) {
                System.out.println(string + " INCLUYE 'zar'.");
                contador++;
            } else {
                System.out.println(string + " NO incluye 'zar'.");
            }
        }
        if (contador == 0) {
            System.out.println("Ningúna cadena incluye el subcadena 'zar'.");
        } else if (contador == 1) {
            System.out.println("Solo una cadena incluye la subcadena 'zar'.");
        } else {
            System.out.println(contador + " cadenas incluyen la subcadena 'zar'.");
        }
    }
}
