package Prueba_chofer;

public abstract class persona {
    public String nombre;
    public int edad;
    private int cedula;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

}
