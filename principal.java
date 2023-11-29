import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); // 'in' significa entrada, 'out' significa salida
        // Ejemplo de lectura de datos
        System.out.print("Ingrese su nombre: ");
        String nombre = lectura.nextLine(); // Leemos un dato tipo cadena de caracteres
        System.out.print("Ingrese su edad: ");
        int edad = lectura.nextInt(); // Leemos un dato tipo entero
        lectura.nextLine(); // Limpiamos el buffer después de leer un entero
        System.out.print("Salario: ");
        float salario = lectura.nextFloat();
        lectura.nextLine(); // Limpiamos el buffer después de leer un float
        System.out.print("Ingrese su apellido: ");
        String apellido = lectura.nextLine();

        // Ejemplo de cómo se vería si no limpiamos el buffer
        System.out.println("¿Qué pasará si no limpiamos el buffer?");

        System.out.print("Ingrese su nombre2: ");
        String nombre2 = lectura.nextLine();
        System.out.print("Ingrese su edad2: ");
        int edad2 = lectura.nextInt();
        lectura.nextLine(); // Limpiamos el buffer después de leer un entero
        System.out.print("Salario2: ");
        float salario2 = lectura.nextFloat();
        lectura.nextLine(); // Limpiamos el buffer después de leer un float
        System.out.print("Ingrese su apellido: ");
        String apellido2 = lectura.nextLine();
        // Cerrar el scanner al finalizar
        lectura.close();
    }
}