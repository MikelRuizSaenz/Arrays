package ArraysEnteros;

public class Ejercicio1 {
    int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

    public int cuantos3(int[] nums) {
        // Se inicializa en 0 el contador que llevara la cuenta de los números 3 registrados.
        int contador = 0;
        
        // Se recorre el array y si el número coincide con el 3 se suma 1 al contador.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                contador++;
            }
        }

        return contador;
    }

    public void main(String[] args) {
        if (cuantos3(tabla) == 0) {
            System.out.println("El número 3 no aparece en el array.");
        } else if (cuantos3(tabla) == 1) {
            System.out.println("El número 3 solo aparece una vez.");
        } else {
            System.out.println("El número 3 aparece un total de " + cuantos3(tabla) + " veces.");
        }
    }
}
