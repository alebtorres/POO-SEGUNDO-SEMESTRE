package cuarto_ejercicio;

class Formula1 extends Vehiculo {
    public Formula1() {
        super("Fórmula 1", 200);
    }

    @Override
    public void mover() {
        System.out.println("El " + getNombre() + " se mueve a " + getVelocidad() + " km/h.");
    }
}