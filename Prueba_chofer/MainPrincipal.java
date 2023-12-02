package Prueba_chofer;

import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println(
                    "Ingrese su deseo de continuar o cancelar con el servicio: \n1.aceptar \n2.cancelar \n3.Salir ");
            int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    scanner.nextLine();
                    String nombreYo = scanner.nextLine();

                    System.out.println("Ingrese su edad: ");
                    int edadYo = scanner.nextInt();

                    System.out.println("Ingrese su id: ");
                    scanner.nextLine();
                    String idPasajero = scanner.nextLine();

                    System.out.println("Ingrese el numero de placa del taxi: ");

                    String p_taxi = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Ingrese el codigo de placa del taxi: ");
                    String id_taxi = scanner.nextLine();

                    pasajero pasajero1 = new pasajero(nombreYo, edadYo, idPasajero);
                    pasajero1.setCedula(1706117330);

                    chofer chofer1 = new chofer(nombreYo, edadYo, p_taxi, id_taxi);

                    System.out.println("El nombre del pasajero es: " + nombreYo);
                    System.out.println("La edad del pasajero es: " + edadYo);
                    System.out.println("La cedula del pasajero es: " + pasajero1.getCedula());
                    System.out.println("El id del pasajero es: " + idPasajero);
                    System.out.println("La placa del taxi es: " + p_taxi);
                    System.out.println("El codigo de la placa del taxi es: " + id_taxi);

                    pasajero1.pedir_taxi();
                    chofer1.aceptar_carrera();
                    break;

                case 2:
                    System.out.println(
                            "Usted a elegido cancelar el servicio, siga los siguientes paso para realizar el proceso: ");
                    System.out.println("Ingrese su nombre: ");
                    scanner.nextLine();
                    String nombre2 = scanner.nextLine();

                    System.out.println("Ingrese su edad: ");
                    int edad2 = scanner.nextInt();

                    System.out.println("Ingrese su id: ");
                    scanner.nextLine();
                    String id2 = scanner.nextLine();

                    System.out.println("Ingrese la placa del taxi: ");
                    scanner.nextLine();
                    String p_taxi2 = scanner.nextLine();

                    System.out.println("Ingrese el codigo de la placa del taxi: ");
                    String id_taxi2 = scanner.nextLine();

                    pasajero pasajero2 = new pasajero(nombre2, edad2, id2);
                    pasajero2.setCedula(1706117330);

                    chofer chofer2 = new chofer(nombre2, edad2, p_taxi2, id_taxi2);

                    System.out.println("El nombre del pasajero es: " + nombre2);
                    System.out.println("La edad del pasajero es: " + edad2);
                    System.out.println("La cedula del pasajero es: " + pasajero2.getCedula());
                    System.out.println("El id del pasajero es: " + id2);
                    System.out.println("La placa del taxi es: " + p_taxi2);
                    System.out.println("El codigo de la placa del taxi es: " + id_taxi2);

                    pasajero2.cancelar_taxi();
                    chofer2.cancelar_carrera();

                    break;
                case 3:
                    System.out.println("\nEl programa se esta cerrando.....");
                    continuar = false;
                    break;
                default:
                    System.out
                            .println("\nOpción no válida. Por favor, elige 1 para Gato, 2 para Perro o 3 para Salir.");
                    break;

            }

        }
        scanner.close();
    }
}