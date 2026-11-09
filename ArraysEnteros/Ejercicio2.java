package ArraysEnteros;

public class Ejercicio2 {
    int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

    public String sumaDeMitades(int[] nums) {
        // Se calcula el centro del array.
        int centro = (int) nums.length / 2;

        // Se inicilizan en 0 dos variables que sumaran el resultado de las sumas de cada mitad.
        int primeraMitad = 0;
        int segundaMitad = 0;
        
        // Se recorren las posiciones desde 0 hasta el centro y se van sumando.
        for (int i = 0; i < centro; i++) {
            primeraMitad += nums[i];
        }

        // Se recorren las posiciones desde el centro hasta el final y se van sumando.
        for (int i = centro; i < nums.length; i++) {
            segundaMitad += nums[i];
        }

        // Se determina el resultado usando las sumas de la primera y segunda mitad.
        if (primeraMitad > segundaMitad) {
            return "La primera mitad suma a un número mayor que la segunda mitad. \n Primera mitad: " + primeraMitad + ". \n Segunda mitad: " + segundaMitad + " .";
        } else if (segundaMitad > primeraMitad) {
            return "La segunda mitad suma a un número mayor que la primera mitad. \n Primera mitad: " + primeraMitad + ". \n Segunda mitad: " + segundaMitad + " .";
        } else {
            return "Ambas mitades suman al mismo número. \n Primera mitad: " + primeraMitad + ". \n Segunda mitad: " + segundaMitad + ".";
        }
    }

    public void main(String[] args) {
        System.out.println(sumaDeMitades(tabla));
    }
}
