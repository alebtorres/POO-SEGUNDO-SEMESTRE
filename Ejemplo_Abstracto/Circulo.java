package Ejemplo_Abstracto;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, String color, int numLados, double radio) {
        super(nombre, color, numLados);
        this.radio = radio;
    }

    @Override
    public double calcularElArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularElPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un círculo de radio " + radio + " y color " + color + ".");
    }
}