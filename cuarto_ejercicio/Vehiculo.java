package cuarto_ejercicio;

abstract class Vehiculo {
    private String nombre;
    private int velocidad;

    public Vehiculo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public abstract void mover();

    public String getNombre() {
        return this.nombre;
    }

    public int getVelocidad() {
        return this.velocidad;
    }
}
