package Prueba;

import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Por favor, elige un animal:\n1. Gato\n2. Perro\n3. Salir");
            int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Por favor, ingresa el nombre del gato:");
                    String nombreGato = scanner.nextLine();

                    System.out.println("Ingrese el color del gato: ");
                    String colorGato = scanner.nextLine();

                    gato2 gato = new gato2(nombreGato, colorGato);
                    // establecer edad de animal
                    gato.setEdad(6);
                    System.out.println("El nombre del gato es: " + nombreGato);
                    System.out.println("La edad del gato es: " + gato.getEdad());
                    System.out.println("El color del gato es: " + colorGato);
                    gato.sonido_animal();
                    gato.trepar_arbol();
                    gato.cazar_raton();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del perro: ");
                    String nombrePerro = scanner.nextLine();

                    System.out.println("Ingrese la edad del perro: ");
                    String razaPerro = scanner.nextLine();

                    perro1 perro = new perro1(nombrePerro, razaPerro);

                    perro.setEdad(2);
                    System.out.println("Nombre del perro: " + nombrePerro);
                    System.out.println("La edad del perro es: " + perro.getEdad());
                    System.out.println("Raza del perro: " + razaPerro);
                    perro.sonido_animal();
                    perro.correr();
                    perro.jugar();

                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 1 para Gato, 2 para Perro o 3 para Salir.");
                    break;
            }
        }
        scanner.close();
    }
}
