package tercer_ejercicio;

public class matriz {
    public int[][] matriz;

    public matriz(int size) {
        this.matriz = new int[size][size];
    }

    public void llenar_matriz() throws Exception {
        if (matriz == null) {
            throw new Exception("La matriz no ha sido creada");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }
    }

    public void imprimir_matriz() throws Exception {
        if (matriz == null) {
            throw new Exception("La matriz no ha sido inicializada ");
        }

        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.println(valor + "");
            }

            System.out.println();

        }
    }
}