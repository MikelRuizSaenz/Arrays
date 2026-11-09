package ArraysCadenas;

public class Ejercicio4 {
    String[] cadenas = {"SuE", "CHArRloTTe", "Anna", "MIke", "WiLLIam", "Ed", "Abba", "Racecar"};

    // Función auxiliar, si devuleve verdadero hay más mayúsculas; falso hay más minúsculas.
    public boolean minusculasVsMayusculas(String cadena) {
        // Se inicializa dos registros para contar mayusculas y minusculas
        int mayusculas = 0;
        int minusculas = 0;

        // Se recorren los caracteres de la cadena,
        // si el valor esta entre los valores ascii de una mayúscula, se suma uno al registro de mayúsculas.
        // Si el valor esta entre los valores ascii de una minúscula, se suma uno al registro de minúsculas.
        for (int i = 0; i < cadena.length(); i++) {
            if (32 < cadena.charAt(i) && cadena.charAt(i) < 91) {
                mayusculas++;
            } else if (96 < cadena.charAt(i) && cadena.charAt(i) < 123) {
                minusculas++;
            }
        }

        if (mayusculas > minusculas) {
            return true;
        } else {
            return false;
        }
    }

    public void main(String[] args) {
        // Por cada cadena en el array de cadenas,
        // si el resultado es verdadero se imprime la cadena en la terminal.
        for (String cadena : cadenas) {
            if (minusculasVsMayusculas(cadena)) {
                System.out.println(cadena);
            };
        }
    }
}
