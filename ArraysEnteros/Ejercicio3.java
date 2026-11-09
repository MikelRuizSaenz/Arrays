package ArraysEnteros;

public class Ejercicio3 {
    int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

    // Se usa una función auxiliar para evaluar si todos los números son únicos o no.
    public boolean valoresUnicos(int[] nums) {
        // Se recorren todos los números del array,
        // en cada iteración se guarda el número actual.
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            
            // Se recorre el array desde una posición mas que i para comprobar
            // que el número seleccionado en el primer bucle no se repita más adelante.
            // Si lo hiciera devolveria falso.
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == curr) {
                    return false;
                }
            }
        }

        // Si la función ha recorrido el bucle completo y no ha devuelto false,
        // automaticamente devolvera true.
        return true;
    }

    public void main(String[] args) {
        if (valoresUnicos(tabla)) {
            System.out.println("Todos los números del array son únicos.");
        } else {
            System.out.println("El array contiene números duplicados.");
        }
    }
}
