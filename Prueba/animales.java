package Prueba;

public abstract class animales {
    public String nombre;
    private int edad;

    public animales(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void sonido_animal() {
        System.out.println("El animal esta haciendo ruido");
    }
}