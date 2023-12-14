package prueba1;

import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
        do {
            try {
                System.out.println("---Guarda le primer libro---");
                System.out.println("Ingrese el nombre del titulo: ");
                String titulo = scanner.nextLine();
                if (!titulo.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El nombre del titulo solo puede contener letras");
                }
                System.out.println("Ingrese el nombre del autor: ");
                String autor = scanner.nextLine();
                if (!autor.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El nombre del autor solo puede contener letras");
                }
                System.out.println("Ingrese el anio de publicacion: ");
                double anio_publicacion = scanner.nextDouble();
                scanner.nextLine();
                if (anio_publicacion > 0 || anio_publicacion < 2024) {
                    throw new IllegalArgumentException("ERROR: El anio de publicacion no puede ser negativo");
                }
                System.out.println("Ingrese el genero literario del libro: ");
                String genero = scanner.nextLine();
                if (!genero.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR:El genero solo puede contener letras");
                }

                LibroFiccion libroFiccion = new LibroFiccion(titulo, autor, anio_publicacion, genero);
                libroFiccion.setAnio_publicacion(anio_publicacion);
                libroFiccion.mostrar_información();
                System.out.println("\n");
                System.out.println("El libro en anios publicado tiene: " + libroFiccion.calcular_edad());
                System.out.println("\n");

                datosCorrectos = true;

            } catch (NumberFormatException e) {
                System.out.println("Error, ingrese un numero valido para el año");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!datosCorrectos);
        datosCorrectos = false;
        System.out.println("Se registro el primer libro");

        do {
            try {
                System.out.println("---Guarda el segundo libro--- ");
                System.out.println("\nIngrese el nombre del titulo: ");
                String titulo = scanner.nextLine();
                if (!titulo.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El titulo solo tiene que contener letras");
                }

                System.out.println("Ingrese el nombre del autor: ");
                String autor = scanner.nextLine();
                if (!autor.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El autor solo puede contener letras");
                }
                System.out.println("Ingrese el anio de publicacion: ");
                double anio_publicacion = scanner.nextDouble();
                if (anio_publicacion > 0 || anio_publicacion < 2024) {
                    throw new IllegalArgumentException("ERROR: El anio de publicacion no puede ser negativo");
                }
                System.out.println("Ingrese el tema del libro: ");
                String tema = scanner.nextLine();
                scanner.nextLine();
                if (!tema.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El tema solo debe contener letras");
                }

                LibroNoficcion libroNoficcion = new LibroNoficcion(titulo, autor, anio_publicacion, tema);
                libroNoficcion.setAnio_publicacion(anio_publicacion);
                libroNoficcion.mostrar_información();
                System.out.println("\n");
                System.out.println("El libro en anios publicado tiene: " + libroNoficcion.calcular_edad());
                System.out.println("\n");

                datosCorrectos = true;

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido para los años");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!datosCorrectos);
        datosCorrectos = false;
        System.out.println("Se registro el segundo libro");

        scanner.close();
    }
}