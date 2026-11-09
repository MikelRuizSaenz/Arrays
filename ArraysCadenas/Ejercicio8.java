package ArraysCadenas;

public class Ejercicio8 {
    String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed", "Abba"};

    // Función auxiliar que deveulve true si la cadena empieza por "a".
    public boolean empiezaPorA(String cadena) {
        // Si el primer caracter de la cadena empieza por "a" devuelve verdadero.
        // Sino devuelve falso.
        if (cadena.toLowerCase().charAt(0) == 'a') {
            return true;
        }

        return false;
    }

    public void main(String[] args) {
        // Se iniciliza una variable que lleve el registro de cuantas palabras empiezan por "A".
        int comienzanPorA = 0;


        // Se pasan todas las cadenas del array por la función auxiliar.
        // Si la función auxiliar devuelve verdadero se suma uno a la variable que guarda la cuenta.
        for (String string : cadenas) {
            if (empiezaPorA(string)) {
                System.out.println(string + " comienza por 'A'.");
                comienzanPorA++;
            } else {
                System.out.println(string + " NO comienza por 'A'.");                
            }
        }

        if (comienzanPorA == 0) {
            System.out.println("Ningúna cadena empieza por 'A'.");
        } else if (comienzanPorA == 1) {
            System.out.println("Solo una cadena empieza por 'A'.");
        } else {
            System.out.println(comienzanPorA + " cadenas empiezan por 'A'.");
        }
    }
}
