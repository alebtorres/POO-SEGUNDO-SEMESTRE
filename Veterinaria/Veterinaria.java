package Veterinaria;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Veterinaria {

    private static class Veterinario {
        private String nombre;
        private String telefono;
        private String correo;

        public Veterinario(String nombre, String telefono, String correo) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.correo = correo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
    }

    private static class Cliente {
        private String nombre;
        private String telefono;
        private String correo;
        private String direccion;

        public Cliente(String nombre, String telefono, String correo, String direccion) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.correo = correo;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veterinario veterinario = new Veterinario("Dr. Black", "1234567890", "white@gmail.com");
        Cliente cliente = new Cliente("Juan Pérez", "9876543210", "juanperez@gmail.com", "Calle 123");

        try {
            System.out.println("Introduzca el nombre del cliente:");
            cliente.setNombre(scanner.nextLine());

            System.out.println("Introduzca el teléfono del cliente:");
            cliente.setTelefono(scanner.nextLine());

            System.out.println("Introduzca el correo del cliente:");
            cliente.setCorreo(scanner.nextLine());

            System.out.println("Introduzca la dirección del cliente:");
            cliente.setDireccion(scanner.nextLine());

            File file = new File("C://Users//DELL//Documents//Archivos");
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("Cliente: " + cliente.getNombre() + "\n");
            fileWriter.write("Teléfono: " + cliente.getTelefono() + "\n");
            fileWriter.write("Correo: " + cliente.getCorreo() + "\n");
            fileWriter.write("Dirección: " + cliente.getDireccion() + "\n");
            fileWriter.write("Veterinario: " + veterinario.getNombre() + "\n");
            fileWriter.write("Teléfono veterinario: " + veterinario.getTelefono() + "\n");
            fileWriter.write("Correo veterinario: " + veterinario.getCorreo() + "\n");

            fileWriter.close(); // Cierra el FileWriter

            System.out.println("Información guardada correctamente.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}