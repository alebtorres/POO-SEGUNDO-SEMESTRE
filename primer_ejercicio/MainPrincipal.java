package primer_ejercicio;

import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        // se crea objeto cuenta 1 sin parametros
        // se ejecuta el constructor por defecto
        cuenta cuenta1 = new cuenta();

        System.out.println("Nombre: ");
        nombre = sc.nextLine();

        System.out.println("Numero de cuenta: ");
        numero = sc.nextLine();

        System.out.println("Tipo de interes: ");
        tipo = sc.nextDouble();

        System.out.println("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

        // se crea el objeto cuenta2 con los valores leidos por teclado
        // se ejecuta el constructor con parametros
        cuenta cuenta2 = new cuenta("Alexander Ordonez Torres", "989847777", 2.25, 500);

        // se cre cuenta3 como copia de cuenta1
        // se ejecuta el constructor copia
        cuenta cuenta3 = new cuenta(cuenta1);

        // mostrar los datos de cuenta1
        System.out.println("--Datos de la cuenta 1--");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Numero de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interes: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        // se realiza un ingreso en cuenta1
        cuenta1.ingreso(5000);

        // mostrar el salod de cuenta1 después del ingreso
        System.out.println("Saldo: " + cuenta1.getSaldo());

        // mostrar los datos de cuenta2
        System.out.println("--Datos de la cuenta 3--");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Numero de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interes: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        // realizar una transferencia de 10$ desde cuenta3 a cuenta2
        cuenta3.transferencia(cuenta2, 10);

        // mostrar el saldo de cuenta2
        System.out.println("Saldo de cuenta 2 despues de la transferencia: ");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        // mostrar el saldo de cuenta3
        System.out.println("--Saldo de la cuenta 3--");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        sc.close();
    }
}
