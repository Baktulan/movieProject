import models.Cast;
import models.DataBase;
import models.Director;
import models.Movie;
import models.serviceImpl.DirectorServiceImpl;
import models.serviceImpl.MovieServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cast> casts = new ArrayList<>(List.of(
                new Cast("Keanu Reeves", "Jhon wick"),
                new Cast("Sam Worthington", "Jake"),
                new Cast("Christian Bale", "Bruce Wayne"),
                new Cast("Tobey Maguire", "Peter Parker"),
                new Cast("Will Smith", "Robert Neville")));

        List<Director> directors = new ArrayList<>(List.of(
                new Director("Chad ", "Stahelski"),
                new Director("James ", "Cameron"),
                new Director("Matt ", "Reeves"),
                new Director("Sam ", "Raimi"),
                new Director("Francis ", "Lawrence")));

        List<Movie> movies = new ArrayList<>(List.of(
                new Movie("John Wick", 2014, "Crime ,Thriller", new Director("Chad", "Stahelski"), List.of(casts.get(0))),
                new Movie("Avatar", 2009, "Action, Adventure, Fantasy", new Director("James ", "Cameron"), List.of(casts.get(1))),
                new Movie("Batman", 2022, " Action ,Crime", new Director("Matt ", "Reeves"), List.of(casts.get(2))),
                new Movie("Spider-Man", 2002, "Crime ,Thriller, Fantasy", new Director("Sam ", "Raimi"), List.of(casts.get(3))),
                new Movie("I am legend", 2007, "Fantasy ,Drama, Horror", new Director("Francis ", "Lawrence"), List.of(casts.get(4)))));

        DataBase dataBase = new DataBase();
        MovieServiceImpl movieService = new MovieServiceImpl(dataBase);
        DirectorServiceImpl directorService = new DirectorServiceImpl(dataBase);
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Press 1 to print catalog
                Press 2  to find a movie by full name or part name
                Press 3 to find movie by actor name
                Press 4 ti find movie by Year
                Press 5 to find movie by Director
                Press 6 to find movie by Genre
                Press 7 to find movie by Role
                Press 8 to sort by movie Name (A-Z)
                Press 9 to sort by movie Name (Z-A)
                Press 10 to sort by Year (Descending)
                Press 11 to sort by Year (Ascending)
                Press 12 to sort by  Director""");
        int num;
        while (true) {
            num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("\n~~~~~~~~~~~~~~~All movies~~~~~~~~~~~~~~");
                    System.out.println(movieService.getAllMovies(movies));
                }
                case 2 -> {
                    System.out.println("\n~~Write full or part name of movie~~");
                    movieService.findMovieByFullNameOrPartName(movies);
                }
                case 3 -> {
                    System.out.println("\n~~Write Actor name~~");
                    movieService.findMovieByActorName(movies);
                }
                case 4 -> {
                    System.out.println("\n~~Write movie's year~~");
                    movieService.findMovieByYear(movies);
                }
                case 5 -> {
                    System.out.println("\n~~Write name of Director~~");
                    movieService.findMovieByDirector(movies);
                }
                case 6 -> {
                    System.out.println("\n~~Write Genre of movie~~");
                    movieService.findMovieByGenre(movies);
                }
                case 7 -> {
                    System.out.println("\n~~Write movie's role~~");
                    movieService.findMovieByRole(movies);
                }
                case 8 -> {
                    System.out.println("\n~~Sort by Name (A-Z)~~");
                    movieService.sortByMovieName(movies);
                    System.out.println(movies);
                }
                case 9 -> {
                    System.out.println("\n~~Sort by Name(Z-A)~~");
                    movieService.sortByMovieName2(movies);
                    System.out.println(movies);
                }
                case 10 -> {
                    System.out.println("\n~~Sort by Year (Descending)~~");
                    movieService.sortByYear(movies);
                    System.out.println(movies);
                }
                case 11 -> {
                    System.out.println("\n~~Sort by Year (Ascending)~~");
                    movieService.sortByYearAscendig(movies);
                    System.out.println(movies);
                }
                case 12 -> {
                    System.out.println("\n~~Sort by Director~~");
                    movieService.sortByDirector(movies);
                    System.out.println(movies);
                    break;
                }
            }
        }


    }
}
