package Ejemplo_Abstracto;

public abstract class Figura {
    protected String nombre;
    protected String color;
    protected int numLados;

    public Figura(String nombre, String color, int numLados) {
        this.nombre = nombre;
        this.color = color;
        this.numLados = numLados;
    }

    public abstract double calcularElArea();

    public abstract double calcularElPerimetro();

    public abstract void dibujar();
}
