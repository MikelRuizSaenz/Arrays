package ArraysEnteros;

public class Ejercicio11 {
    int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14, 11};

    // Función auxiliar para verficar si los números son primos o no.
    public boolean esPrimo(int num) {
        // Los números primos solo pueden ser divididos por 1 y ellos mismos,
        // por ende, si el número se puede dividir por cualquier número entre 2 y el numero - 1 y dar 0,
        // significara que el número no es primo.
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void main(String[] args) {
        // Se inicializa el contador de primos en 0.
        int primos = 0;
        
        // Se pasan como argumentos de la función auxiliar todos los número del array.
        // Si alguno fuera primo, se añadiria 1 al registro de primos.
        for (int num : tabla) {
            if (esPrimo(num)) {
                System.out.println(num + " ES un número primo.");
                primos++;
            } else {
                System.out.println(num + " NO es un número primo.");
            }
        }

        if (primos == 0) {
            System.out.println("No hay ningun número primo.");
        } else if (primos == 1) {
            System.out.println("Solo hay un número primo.");
        } else {
            System.out.println("Hay un total de " + primos + " números primos.");
        }
    }
}
