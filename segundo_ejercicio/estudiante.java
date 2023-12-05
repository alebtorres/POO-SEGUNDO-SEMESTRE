package segundo_ejercicio;

public class estudiante {
    private String nombre;
    private int[] notas;

    public estudiante(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double caluladoraPromedio() throws Exception {
        if (notas.length == 0) {
            throw new Exception("El estudiante no tiene notas.");
        }
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }

        return (double) suma / notas.length;
    }
}
