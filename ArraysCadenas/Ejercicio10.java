package ArraysCadenas;

public class Ejercicio10 {
    String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed", "Abba", "Anna"};

    // Función auxiliar para verificar cadenas repetidas en un array
    public boolean contieneCadenasRepetidas(String[] cadenas) {

        // Se recorren todas las cadenas y se guarda la cadena actual en una variable.
        for (int i = 0; i < cadenas.length; i++) {
            String cadena = cadenas[i];

            // A partir del siguiente indice de i, se recorre el array para revisar que no haya otra cadena idéntica.
            // Si encuentra una cadena idéntica a la anterior, devuele verdadero.
            for (int j = i + 1; j < cadenas.length; j++) {
                if (cadenas[j] == cadena) {
                    return true;
                }
            }
        }

        // Si el bucle se completa y no devuele verdadero, devuelve falso automáticamente.
        return false;
    }

    public void main(String[] args) {
        if (contieneCadenasRepetidas(cadenas)) {
            System.out.println("El array CONTIENE cadenas repetidas.");
        } else {
            System.out.println("El array NO contiene cadenas repetidas.");
        }
    }
}
