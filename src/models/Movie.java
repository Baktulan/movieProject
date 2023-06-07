package models;

import java.util.Comparator;
import java.util.List;

public class Movie implements  Comparable<Movie> {
    private String name;

    private int year;

    private String genre;

    private Director director;

    private List<Cast> cast;

    public Movie(String name, int year, String genre, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "\nMovie:" +
                "\nName: " + name +
                "\nYear: " + year +
                "\nGenre: " + genre +
                "\nDirector " + director +
                "\n* Cast of " + name + " *" + cast;
    }


    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.getName());
    }
    public static Comparator<Movie>sortMyDirector= Comparator.comparing(Movie::getName);
    public  static Comparator<Movie>sortByYearAscendin= (o1, o2) -> o2.getYear()- o1.getYear();

    public static Comparator<Movie> sortByYear = Comparator.comparingInt(Movie::getYear);
}




