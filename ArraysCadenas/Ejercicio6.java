package ArraysCadenas;

public class Ejercicio6 {
    String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed", "Abba", "Racecar"};

    // Función auxiliar para verificar si una cadena es un palíndromo o no.
    public boolean esPalindromo(String cadena) {
        // Se inicializan los registro en ambos extremos de la cadena.
        int i = 0;
        int j = cadena.length() - 1;

        // Se recorre la cadena de izquierda a derecha y derecha a izquierda simultanemente
        // mientras se compara que el resultado sea el mismo o de lo contrario se devolvería false.
        while (i < j) {
            if (cadena.toLowerCase().charAt(i) != cadena.toLowerCase().charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        
        // Si el bucle no devuelve false y es completado, la función devuelve true automaticamente.
        return true;
    }

    public void main(String[] args) {
        // Regsitro para llevar cuentas del número de palíndromos.
        int palindromos = 0;

        // Se recorren todas las cadenas y si alguna devuelve true, se suma uno al registro de palíndromos.
        for (String string : cadenas) {
            if (esPalindromo(string) == true) {
                System.out.println(string + " ES un palíndromo.");
                palindromos++;
            } else {
                System.out.println(string + "NO es un palíndromo.");
            }
        }
        if (palindromos == 0) {
            System.out.println("No hay palíndromos en el array.");
        } else if (palindromos == 1) {
            System.out.println("Solo hay un palíndromo en el array.");
        } else {
            System.out.println("Hay un total de " + palindromos + " palíndromos en el array.");
        }
    }
}
