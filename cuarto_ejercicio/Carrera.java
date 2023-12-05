package cuarto_ejercicio;

class Carrera {
    private int vueltas;
    private Vehiculo vehiculo;

    public Carrera(int vueltas) {
        this.vueltas = vueltas;
        this.vehiculo = new Formula1();
    }

    public void comenzar() {
        System.out.println("La carrera ha comenzado!");
        for (int i = 0; i < this.vueltas; i++) {
            this.vehiculo.mover();
        }
        System.out.println("La carrera ha terminado!");
    }
}
