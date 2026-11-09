package ArraysEnteros;

public class Ejercicio4 {
    int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

    public int[] avanzarPosiciones(int[] nums) {
        // Se inicializa guardando la última posicion.
        int prev = nums[nums.length - 1];

        // Se reccoren todas las posiciones del array,
        // en cada iteración se guarda el valor de la posición,
        // a la posición actual se le asigna el valor de la última posición guardado en la última iteración,
        // se actuliza el valor de la posición anterior con el valor que había en la posición actual para
        // que en la siguiente iteración se pueda volver a realizar el interacambio de valores.
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            nums[i] = prev;
            prev = curr;
        }

        return nums;
    }

    public void main(String[] args) {
        for (int num : avanzarPosiciones(tabla)) {
            System.out.println(num);
        }
    }
}
