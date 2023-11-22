import java.util.Scanner;

public class sucursales {
    int sucursal;
    String producto;

    public static void main(String[] args) {
        sucursales mainObject = new sucursales();
        mainObject.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, elige una sucursal: 1, 2 o 3");
        String sucursalString = scanner.nextLine();

        // Validar si la entrada del usuario es un número entero
        if (sucursalString.matches("[0-9]+")) {
            sucursal = Integer.parseInt(sucursalString);

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
                    System.out.println("Opción no válida");
                    break;
            }
        } else {
            System.out.println("Opción no válida");
        }

        System.out.println("Por favor, elige un producto: A, B o C");
        producto = scanner.nextLine();

        // Convertir la entrada del usuario a mayúsculas
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
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}