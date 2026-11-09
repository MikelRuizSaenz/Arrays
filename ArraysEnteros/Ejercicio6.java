package ArraysEnteros;

public class Ejercicio6 {
    int[] tabla = new int[20];


    public int[] fibArray(int[] nums) {
        // Se inicializa el array con los dos primeros números de la sequencia.
        nums[0] = 0;
        nums[1] = 1;

        // Se recorre el array desde la 3ra posición hasta la 20,
        // a cada posición se le asigna la suma de las dos últimas posiciones.
        for (int i = 2; i < 20; i++) {
            nums[i] = tabla[i - 2] + tabla[i - 1];
        }

        return nums;
    }

    public void main(String[] args) {
        for (int num : fibArray(tabla)) {
            System.out.println(num);
        }
    }
}
