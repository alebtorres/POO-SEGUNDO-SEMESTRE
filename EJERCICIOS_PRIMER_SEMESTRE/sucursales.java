package EJERCICIOS_PRIMER_SEMESTRE;

import java.util.Scanner;

public class sucursales {
    int sucursal;
    String producto;

    public static void main(String[] args) {
        sucursales objeto_principal = new sucursales();
        objeto_principal.elegir();
    }

    public void elegir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, elige una sucursal: 1, 2 o 3");
        sucursal = scanner.nextInt();

        switch (sucursal) {
            case 1:
                System.out.println("Has elegido la sucursal 1");
                break;
            case 2:
                System.out.println("Has elegido la sucursal 2");
                break;
            case 3:
                System.out.println("Has elegido la sucursal 3");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        System.out.println("Por favor, elige un producto: A, B o C");
        producto = scanner.next();

        producto = producto.toUpperCase();

        switch (producto) {
            case "A":
                System.out.println("Has elegido el producto A de la sucursal " + sucursal);
                break;
            case "B":
                System.out.println("Has elegido el producto B de la sucursal " + sucursal);
                break;
            case "C":
                System.out.println("Has elegido el producto C de la sucursal " + sucursal);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        scanner.close();
    }
}