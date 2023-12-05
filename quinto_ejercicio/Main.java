package quinto_ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] productos = { "Coca-Cola", "Pepsi", "Agua", "Jugo de naranja", "Cafe" };
        int seleccion = -1;
        Scanner scanner = new Scanner(System.in);

        while (seleccion != 0) {
            System.out.println("\nSeleccione un producto: ");
            for (int i = 0; i < productos.length; i++) {
                System.out.println((i + 1) + "." + productos[i]);
            }

            System.out.println("\n(Si desea salir pulse: 0)");
            System.out.println("Ingrese su seleccion: ");
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Ha seleccionado la bebida Coca-cola");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la bebida Pepsi");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la bebida Agua");
                    break;
                case 4:
                    System.out.println("Ha seleccionado la bebida Jugo de naranja");
                    break;
                case 5:
                    System.out.println("Ha seleccionado la bebida Cafe");
                    break;
                case 0:
                    System.out.println("Gracias por usar la maquina Expendedora de la ESPE.....");
                    break;
                default:
                    System.out.println("Vuelva a seleccionar una opción correcta!!");
                    break;
            }

        }
        scanner.close();
    }
}
