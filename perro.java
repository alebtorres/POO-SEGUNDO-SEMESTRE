public class perro {
    String nombre;
    int edad;
    String raza;

    public perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println(this.nombre + " esta ladrando");
    }

    public void correr() {
        System.out.println(this.nombre + " esta corriendo");
    }

    public void descansar() {
        System.out.println(this.nombre + " esta descansando");
    }

    public static void main(String[] args) {
        perro perro1 = new perro("Titan", 1, "schnauzer");
        perro1.ladrar();
        perro1.correr();
        perro1.descansar();
    }
}
