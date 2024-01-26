package EJERCICIOS_PRIMER_SEMESTRE;

public class gato1 {
    String nombre;
    int edad;
    String color;
    String altura;

    public gato1(String nombre, int edad, String color, String altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.altura = altura;
    }

    public void maullar() {
        System.out.println(this.nombre + "esta maullando");
    }

    public void saltar() {
        System.out.println(this.nombre + "esta saltando");
    }

    public void correr() {
        System.out.println(this.nombre + "esta corriendo");
    }

    public void dormir() {
        System.out.println(this.nombre + "esta durmiendo");
    }

    public static void main(String[] args) {
        gato1 gat1 = new gato1("Alfred ", 2, "Gris con rayas negras", "32cm");
        gat1.maullar();
        gat1.saltar();
        gat1.correr();
        gat1.dormir();
    }

}
