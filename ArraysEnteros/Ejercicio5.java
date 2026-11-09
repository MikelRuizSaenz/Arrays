package ArraysEnteros;

public class Ejercicio5 {
    int[] tabla = new int[10];

    public int[] arrayFactorial(int[] nums) {
        for (int i = 0; i < 10; i++) {
            // Se inicializa la suma en 1 ya que 0! = 1.
            int suma = 1;

            // Se recorren todos los números hasta el número actual
            // mientras se va sumando la multiplicación a la variables suma.
            for (int j = 1; j <= i; j++) {
                suma *= j;
            }

            // Se añade la suma al array.
            nums[i] = suma;
        }

        return nums;
    }

    public void main(String[] args) {
        for (int num : arrayFactorial(tabla)) {
            System.out.println(num);
        }
    }
}
