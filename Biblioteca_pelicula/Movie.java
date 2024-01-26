package Biblioteca_pelicula;

public class Movie {
    private String title;
    private String director;
    private String coverImagePath;
    private String synopsis;

    public Movie(String title, String director, String coverImagePath, String synopsis) {
        this.title = title;
        this.director = director;
        this.coverImagePath = coverImagePath;
        this.synopsis = synopsis;
    }

    // getters and setters for each field
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCoverImagePath() {
        return coverImagePath;
    }

    public void setCoverImagePath(String coverImagePath) {
        this.coverImagePath = coverImagePath;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}