package tercer_ejercicio;

import java.util.Scanner;

class MainPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo bidimensional: ");
        int size = scanner.nextInt();
        matriz Matriz = new matriz(size);
        try {
            Matriz.llenar_matriz();
            Matriz.imprimir_matriz();
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        scanner.close();
    }
}