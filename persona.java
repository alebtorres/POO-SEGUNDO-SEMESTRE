public class persona {
    private String nombre;
    int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saltar() {
        System.out.println(this.nombre + " empezo a saltar");
    }

    public void comer() {
        System.out.println(this.nombre + " empezo a comer");
    }

    public void nadar() {
        System.out.println(this.nombre + " empezo a nadar");
    }

    public static void main(String[] args) {
        persona p2 = new persona("Alexander ", 19);
        p2.saltar();
        p2.comer();
        p2.nadar();
    }
}
