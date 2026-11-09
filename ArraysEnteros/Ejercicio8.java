package ArraysEnteros;

public class Ejercicio8 {
    int tabla[] = {3, 6, 2, 77, 2, 6, 3};

    // Función auxiliar para verificar si el array de números es capicua o no.
    public boolean secuenciaCapicua(int[] nums) {
        // Se inicializa una variable en 0 y otra en el número al que pertenezca la última posición del array.
        int i = 0;
        int j = nums.length - 1;

        // Mientras i sea menor que j,
        // Se recorrera el array por el principio y el final usando i y j como punteros
        // y a la vez se comparara que el valor de la izquierda y el de la derecha coincidan.
        // Si no lo hicieran el array no sería capicua y devolveria falso, si no hay inconvenientes durante
        // las iteraciones, la función devolvera verdadero.
        // Al final de cada iteración se suma una posición a i y se resta otra a j.
        while (i < j) {
            if (nums[i] != nums[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public void main(String[] args) {
        System.out.println(secuenciaCapicua(tabla));
    }
}
