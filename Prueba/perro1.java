package Prueba;

public class perro1 extends animales {
    public String raza;

    public perro1(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public void sonido_animal() {
        System.out.println("El perro esta ladrando");
    }

    public void correr() {
        System.out.println("El perro esta corriendo");
    }

    public void jugar() {
        System.out.println("El perro esta jugando");
    }

}
