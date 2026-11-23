public class Matrices {
    double[][] saltos = {
        { 7.85, 8.02, 0.00, 7.91, 8.10, 8.04 },
        { 7.60, 0.00, 7.72, 7.68, 0.00, 7.69 },
        { 8.15, 8.20, 8.05, 0.00, 8.31, 8.28 },
        { 0.00, 7.45, 7.50, 7.38, 7.55, 7.41 },
        { 7.95, 7.88, 0.00, 0.00, 7.30, 8.02 },
    };

    public double[][] podio(double[][] matriz) {
        double[][] podio = new double[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (podio[0][1] <= matriz[i][j]) {
                    podio[2][1] = podio[1][1];
                    podio[2][0] = podio[1][0];
                    podio[1][1] = podio[0][1];
                    podio[1][0] = podio[0][0];
                    podio[0][1] = matriz[i][j];
                    podio[0][0] = i;
                }/*  else if (podio[1][1] <= matriz[i][j]) {
                    podio[2][1] = podio[1][1];
                    podio[2][0] = podio[1][0];
                    podio[1][1] = matriz[i][j];
                    podio[1][0] = i;
                } else if (podio[2][1] <= matriz[i][j]) {
                    podio[1][1] = matriz[i][j];
                    podio[1][0] = i;
                }*/ else {
                    continue;
                }
            }
        }

        return podio;
    }

    public int[][] saltosNulos(double[][] matriz) {
        int[][] nulos = new int[matriz.length][2];

        for (int i = 0; i < matriz.length; i++) {
            nulos[i][0] = i;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0.00) {
                    nulos[i][1]++;
                }
            }
        }

        return nulos;
    }

    public void main(String[] args) {
        double[][] resultadoPodio = podio(saltos);

        for (int i = 0; i < resultadoPodio.length; i++) {
            System.out.println("Puesto " + (i + 1) + " para el saltador " + resultadoPodio[i][0] + " con " + resultadoPodio[i][1] + " metros");
        }

        System.out.println("---");

        int[][] resultadoSaltos = saltosNulos(saltos);

        for (int i = 0; i < resultadoSaltos.length; i++) {
            System.out.println("El saltador " + (i + 1) + " ha tenido " + resultadoSaltos[i][1] + " saltos nulos");
        }
    }
}
