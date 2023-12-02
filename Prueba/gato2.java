package Prueba;

public class gato2 extends animales {
    public String color;

    public gato2(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    public void sonido_animal() {
        System.out.println("El gato esta maullando");
    }

    public void trepar_arbol() {
        System.out.println("El gato esta trepando un arbol");
    }

    public void cazar_raton() {
        System.out.println("El gato esta cazando a un raton");
    }

}
