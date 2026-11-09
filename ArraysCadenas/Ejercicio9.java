package ArraysCadenas;

public class Ejercicio9 {
    String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed", "Abba"};

    // Función auxiliar para buscar la cadena más larga en un array.
    public int posicionCadenaMasLarga(String[] cadenas) {
        // Se inicializan dos registros, 
        // uno para la posición de la cadena más larga
        // otro para guardar el largo de la cadena más larga. 
        int posicion = 0;
        int masLarga = 0;

        // Se recorren todas las cadenas,
        // si una cadena tiene un largo mayor al largo guardado anteriormente en la variable,
        // se actualiza el largo más grande y la posición de la nueva cadena.
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > masLarga) {
                masLarga = cadenas[i].length();
                posicion = i;
            }
        }

        return posicion + 1;
    }

    public void main(String[] args) {
        System.out.println("La cadena más larga esta en la posición número " + posicionCadenaMasLarga(cadenas) + ".");
    }
}
