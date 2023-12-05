package cuarto_ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de vueltas para la carrera:");
        int vueltas = scanner.nextInt();
        Carrera carrera = new Carrera(vueltas);
        carrera.comenzar();
        scanner.close();
    }
}
