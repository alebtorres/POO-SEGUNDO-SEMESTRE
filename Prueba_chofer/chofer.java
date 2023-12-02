package Prueba_chofer;

public class chofer extends persona {
    String n_placa;
    String codigo_placa;

    public chofer(String nombre, int edad, String n_placa, String codigo_placa) {
        super(nombre, edad);
        this.n_placa = n_placa;
        this.codigo_placa = codigo_placa;
    }

    public void aceptar_carrera() {
        System.out.println("El taxista acepta el viaje al pasajero");
    }

    public void cancelar_carrera() {
        System.out.println("El taxista le cancela el viaje al pasajero");
    }

}
