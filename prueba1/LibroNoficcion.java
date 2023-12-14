package prueba1;

public class LibroNoficcion extends Libro {
    public String tema;

    public LibroNoficcion(String titulo, String autor, double anio_publicacion, String tema) {
        super(titulo, autor);
        this.tema = tema;
    }

    public void mostrar_información() {
        System.out.println("El nombre del titulo es: " + this.titulo);
        System.out.println("El nombre del autor es: " + this.autor);
        System.out.println("El anio de publicacion es: " + getanio_publicacion());
        System.out.println("El tema del libro es: " + this.tema);
    }
}
