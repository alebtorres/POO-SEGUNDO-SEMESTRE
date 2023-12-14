package prueba1;

public class LibroFiccion extends Libro {
    public String genero;

    public LibroFiccion(String titulo, String autor, double anio_publicacion, String genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    public void mostrar_información() {
        System.out.println("El nombre del titulo es: " + this.titulo);
        System.out.println("El nombre del autor es: " + this.autor);
        System.out.println("El anio de publicacion es: " + getanio_publicacion());
        System.out.println("El genero literario es: " + this.genero);
    }
}
