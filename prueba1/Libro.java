package prueba1;

public class Libro {
    String titulo;
    String autor;
    private double anio_publicacion;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setAnio_publicacion(double anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public double getanio_publicacion() {
        return anio_publicacion;
    }

    public double calcular_edad() {
        double calcular_edad = (2023) - (getanio_publicacion());
        return calcular_edad;
    }

}
