package Prueba_chofer;

public class pasajero extends persona {
    String n_id;

    public pasajero(String nombre, int edad, String n_id) {
        super(nombre, edad);
        this.n_id = n_id;
    }

    public void pedir_taxi() {
        System.out.println("El pasajero pide el servicio de un taxi");
    }

    public void cancelar_taxi() {
        System.out.println("El pasajero no requiere del servicio de taxi");
    }
}
