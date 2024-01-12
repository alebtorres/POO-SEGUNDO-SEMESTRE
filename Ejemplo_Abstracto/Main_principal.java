package Ejemplo_Abstracto;

public class Main_principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Círculo", "Rojo", 0, 5);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Azul", 4, 7);

        System.out.println("Area del circulo: " + circulo.calcularElArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularElPerimetro());
        circulo.dibujar();

        System.out.println("Area del cuadrado: " + cuadrado.calcularElArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularElPerimetro());
        cuadrado.dibujar();
    }
}