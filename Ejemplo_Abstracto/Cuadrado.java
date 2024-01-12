package Ejemplo_Abstracto;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String nombre, String color, int numLados, double lado) {
        super(nombre, color, numLados);
        this.lado = lado;
    }

    @Override
    public double calcularElArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularElPerimetro() {
        return 4 * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un cuadrado de lado " + lado + " y color " + color + ".");
    }
}