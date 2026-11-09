package ArraysEnteros;

public class Ejercicio7 {
    int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14, 25};

    // Función auxiliar para verificar si el número es par o impar.
    public String paresVsImpares(int num) {
        // Si el número es divisible entre 2 devolvera par,
        // de lo contrario devolvera impar.
        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

    public void main(String[] args) {
        // Se inicializan dos variables para llevar un registro de los numeros pares e impares.
        int pares = 0;
        int impares = 0;

        // Se pasan como argumento de la función auxiliar todos los números del array.
        for (int num : tabla) {
            paresVsImpares(num);

            // Si el número es par, se suma 1 al registro de pares,
            // de lo contrario se suma 1 al registro de impares.
            if (paresVsImpares(num).equals("Par")) {
                pares++;
            } else {
                impares++;
            }
        }

        if (impares > pares) {
            System.out.println("Ganan los números impares.");
        } else if (impares < pares) {
            System.out.println("Ganan los números pares.");
        } else {
            System.out.println("Empate.");
        }

        System.out.println("Hay " + impares + " números impares y " + pares + " números pares.");
    }
}
