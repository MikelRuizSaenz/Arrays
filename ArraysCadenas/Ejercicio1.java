package ArraysCadenas;

public class Ejercicio1 {
    String[] cadenas = {"SuE", "ChArlOtTE", "ANna", "Mike", "William", "Ed", "AbbA", "Racecar"};

    // Función auxiliar que recibe un array de cadenas y devuleve en el mismo formato las longitudes de las cadenas.
    public int[] arrayDeLongitudes(String[] cadenas) {
        // Se inicializa un array de enteros del tamaño del array pasado por el párametro.
        int[] longitudes = new int[cadenas.length];

        // Se recorre el array de cadenas, 
        // se obtiene la longitud de cada cadena y se guarda el valor en el array de enteros.
        // Como las posiciones tienen que coincidir, i sirve como indicador de las posiciones de ambos arrays.
        for (int i = 0; i < cadenas.length; i++) {
            int longitud = cadenas[i].length();

            longitudes[i] = longitud;
        }

        return longitudes;
    }

    public void main(String[] args) {
        // Se recorren todas las longitudes guardadas en el array de enteros que devulve la función auxiliar
        // y se imprime el resultado.
        for (int longitud : arrayDeLongitudes(cadenas)) {
            System.out.println(longitud);
        }
    }
}
