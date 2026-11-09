package ArraysEnteros;

public class Ejercicio10 {
    int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

    // Función auxiliar para verificar si los números son divisibles entre 7.
    public boolean divisibleEntre7(int num) {
        // Si el número pasado como argumento no devuelve 0 al ser dividido entre 7 devuelve verdadero,
        // de lo contrario, se saltara la condicion y devolvera falso automaticamente.
        if (num % 7 == 0) {
            return true;
        }

        return false;
    }

    public void main(String[] args) {
        // Se inicializa una variable que lleva la cuenta de cuantos números son divisibles entre 7.
        int divisibles = 0;
        
        // Por cada número que tenga la tabla,
        // se pasara como argumento a la función que verificara si es o no divisible entre 7.
        // Si fuera divisible, mostrara un mensaje y sumara 1 a el contador.
        for (int num : tabla) {
            if (divisibleEntre7(num)) {
                System.out.println(num + " ES divisible entre 7.");
                divisibles++;
            } else {
                System.out.println(num + " NO es divisible entre 7");
            }
        }

        if (divisibles == 0) {
            System.out.println("No hay números divisibles entre 7.");
        } else if (divisibles == 1) {
            System.out.println("Solo hay un número divisible entre 7.");
        } else {
            System.out.println("Hay un total de " + divisibles + " números divisibles entre 7.");
        }
    }
}
