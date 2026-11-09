package ArraysEnteros;

public class Ejercicio9 {
    public int[] aleatoriosNoDuplicados() {
        int[] nums = new int[8];

        for (int i = 0; i < 8; i++) {
            // Genera un número aleatorio del 0 al 39
            int random = (int) (Math.random() * 40);

            // Se recorren las 8 posiciones del array
            for (int j = 0; j < i; j++) {

                // Si el número aleatorio coincide con un número ya existente,
                // resta una posición a 'i' para que el bucle se repita de nuevo en el mismo indice. 
                // sino, cuando se encuentre en la última posición, se añade el número aleatorio al array.
                if (nums[j] == random) {
                    i--;
                    break;
                } else if (j == i - 1) {
                    nums[i] = random;
                }
            }
        }

        return nums;
    }

    public void main(String[] args) {
        for (int num : aleatoriosNoDuplicados()) {
            System.out.println(num);
        }
    }
}
