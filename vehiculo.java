public class vehiculo {
    String marca;
    int velocidad;
    String placa;

    public vehiculo(String marca, int velocidad, String placa) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.placa = placa;
    }

    public void verificarVelocidad() {
        if (velocidad > 50) {
            System.out.println("Multa aplicada al " + marca + " de placa: " + placa + " ,por exceso de velocidad");
        } else {
            System.out.println("El vehiculo " + marca + " recorre a una velocidad permitida.");
        }
    }

    public static void main(String[] args) {
        vehiculo porche1 = new vehiculo("Porsche", 100, "ABB-1892");
        porche1.verificarVelocidad();
    }
}
