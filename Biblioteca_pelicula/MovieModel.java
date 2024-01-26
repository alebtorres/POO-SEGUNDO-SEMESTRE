package Biblioteca_pelicula;

import java.util.ArrayList;
import java.util.List;

public class MovieModel {
    private List<Movie> movies;
    private int currentMovieIndex;

    public MovieModel() {
        movies = new ArrayList<>();
        // Add some movies to the list
        movies.add(new Movie("La lista de Schindler", "Steven Spielberg", "schindlers_list.jpg",
                "La historia de Oskar Schindler, un hombre que salvó la vida de 1.100 judíos durante el Holocausto."));
        movies.add(new Movie("El padrino", "Francis Ford Coppola", "the_godfather.jpg",
                "La historia de la familia Corleone, una de las familias más poderosas de la mafia en Nueva York."));
        currentMovieIndex = 0;
    }

    public Movie getNextMovie() {
        currentMovieIndex = (currentMovieIndex + 1) % movies.size();
        return movies.get(currentMovieIndex);
    }
}