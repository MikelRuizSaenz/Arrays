package ArraysCadenas;

public class Ejercicio5 {
    String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed", "Abba", "Racecar"};

    // Función auxiliar que convierte la cadena a mayúsculas y la devuelve.
    public String minusculasAMaysuculas(String cadena) {
        return cadena.toUpperCase();
    }

    public void main(String[] args) {
        // Se recorren todas las cadenas del array y se pasan como argumento por la función auxiliar
        // para que se impriman los resultados.
        for (String cadena : cadenas) {
            System.out.println(minusculasAMaysuculas(cadena));
        }
    }
}
