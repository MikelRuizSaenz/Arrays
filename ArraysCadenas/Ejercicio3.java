package ArraysCadenas;

public class Ejercicio3 {
    String[] cadenas = {"sue", "ChaRLotte", "AnNa", "Mike", "WiLLIam", "ED", "AbBA", "RaCECar"};

    // Función auxiliar para contar mayusculas en una cadena
    public int[] contarMayusculas(String[] cadenas) {
        // Se inicializa un array de enteros donde se guardara el número de mayúsculas de cada
        // cadena en su posición correspondiente.
        int[] nums = new int[cadenas.length];

        // Se recorre el array de cadenas.
        for (int i = 0; i < cadenas.length; i++) {
            // En cada iteración se inicializa una variable a 0 para contar las mayúsculas de la cadena.
            int mayusculas = 0;

            // Se recorren todos los caracteres de la cadena actual.
            // Si algun caracter tiene un valor ascii correspondiente a una mayúscula,
            // se sumará uno a la variable que lleva el registro.
            for (int j = 0; j < cadenas[i].length(); j++) {
                if (32 < cadenas[i].charAt(j) && cadenas[i].charAt(j) < 91) {
                    mayusculas++;
                }
            }

            // Finalmente se guarda en el indice actual del array de enteros el número de mayúsculas registrado.
            nums[i] = mayusculas;
        }

        return nums;
    }

    public void main(String[] args) {
        // Se imprimen todos los enteros del array de enteros devuleto por la función auxiliar.
        for (int mayusculas : contarMayusculas(cadenas)) {
            System.out.println(mayusculas);
        }
    }
}
