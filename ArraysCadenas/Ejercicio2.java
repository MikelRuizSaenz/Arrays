package ArraysCadenas;

public class Ejercicio2 {
    String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed", "Abba"};

    // Función auxiliar para ordenar alfabéticamente un array de cadenas.
    public String[] ordenarAlfabeticamente(String[] cadenas) {
        // Se recorren todas las cadenas del array.
        for (int i = 0; i < cadenas.length; i++) {
            // Por cada cadenas, se compara con todas las cadenas de delante,
            // si el método 'compareTo()' que compara la cadena de 'i' con la de 'j' da 1,
            // se guarda la cadena de 'i', 
            // se reasigna la cadena de 'i' por la cadena de 'j' y 
            // la cadena de 'j' por la variable que guardaba una copia de la cadena de 'i' antes de ser modificada.
            // De este modo se efectua un cambio de posiciones determinado por el orden alfabetico de las cadenas.
            for (int j = i + 1; j < cadenas.length; j++) {
                if (cadenas[i].compareTo(cadenas[j]) > 0) {
                    String temp = cadenas[i];
                    cadenas[i] = cadenas[j];
                    cadenas[j] = temp;
                }
            }
        }

        return cadenas;
    }

    public void main(String[] args) {
        // Recorre todas las cadenas del array que ha devuelto la función auxiliar.
        for (String nombre : ordenarAlfabeticamente(cadenas)) {
            System.out.println(nombre);
        }
    }
}
