package models;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Movie> movies= new ArrayList<>();

    public DataBase(List<Movie> movies) {
        this.movies = movies;
    }

    public DataBase() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
