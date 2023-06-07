package models.serviceImpl;

import models.Cast;
import models.DataBase;
import models.Director;
import models.Movie;
import models.service.Findable;
import models.service.Sortable;

import java.util.*;

public class MovieServiceImpl implements Findable, Sortable {
    private DataBase dataBase;

    public MovieServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        dataBase.getMovies().addAll(movies);
        return dataBase.getMovies();
    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String moviesName = scanner.nextLine();
        List<Movie> matchinMovie = new ArrayList<>();
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            if (dataBase.getMovies().get(i).getName().contains(moviesName) || dataBase.getMovies().get(i).getName().equalsIgnoreCase(moviesName)) {
                matchinMovie.add(dataBase.getMovies().get(i));
                break;

            }
        }if (matchinMovie.isEmpty()){
            System.out.println("Not found Movie");
        }else {
            for (Movie m : matchinMovie) {

                System.out.println(moviesName + "-" + m.toString());
            }
        }

    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        List<Movie> actors = new ArrayList<>();
        for (Movie movie : movies) {
            List<Cast> casts = movie.getCast();
            for (Cast actor : casts) {
                if (actor.getActorFullName().contains(actorName) ||
                        actor.getActorFullName().equalsIgnoreCase(actorName)) {
                    actors.add(movie);
                }

            }
        }
        if (actors.isEmpty()){
            System.out.println("Not found Actor");
        }else {
            for (Movie m : actors) {
                System.out.println(actorName + "-" + m.toString());
        }


        }

//        for (int i = 0; i < movies.size(); i++) {
//            Movie movie=movies.get(i);
//            List<Cast> cast=movie.getCast();
//            for (int j = 0; j < cast.size(); j++) {
//                String actor= String.valueOf(cast.get(j));
//                if (actor.contains(actorName)||actor.equalsIgnoreCase(actorName)){
//                    actors.add(movie);
//                    break;

    }


    @Override
    public void findMovieByYear(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        int yearOfMovie = scanner.nextInt();
        List<Movie> movies1 = new ArrayList<>();
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            if (dataBase.getMovies().get(i).getYear() == yearOfMovie) {
                movies1.add(dataBase.getMovies().get(i));
            }
        }if (movies1.isEmpty()){
            System.out.println("Not found Year");
        }else {
            System.out.println(movies1);
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String direcName = scanner.nextLine();
        List<Movie> director = new ArrayList<>();
        for (Movie m : movies) {
            if (m.getDirector().getName().contains(direcName) || m.getDirector().getLastName().contains(direcName)) {
                director.add(m);
            }
        }if (director.isEmpty()){
            System.out.println("Not found Director");
        }else {
            System.out.println(director);
        }


    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String genre = scanner.nextLine();
        List<Movie> movies1 = new ArrayList<>();
        for (Movie m : movies) {
            if (m.getGenre().contains(genre) || m.getGenre().equalsIgnoreCase(genre)) {
                movies1.add(m);
            }

        }
        if (movies1.isEmpty()) {
            System.out.println("Not found Genre");
        } else {
            System.out.println(genre + " " + movies1);

        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.nextLine();
        List<Movie> roleOfmove = new ArrayList<>();
        for (Movie m : movies) {
            List<Cast> movie = m.getCast();
            for (Cast c : movie) {
                if (c.getRole().contains(role) || c.getRole().equalsIgnoreCase(role)) {
                    roleOfmove.add(m);
                }
            }
        } if (roleOfmove.isEmpty()){
            System.out.println("Not found Role");
        }else {
            System.out.println(roleOfmove);
        }


    }

    @Override
    public void sortByMovieName(List<Movie> movies) {
        Collections.sort(movies);

    }

    @Override
    public void sortByMovieName2(List<Movie> movies) {
        Collections.reverse(movies);

    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(Movie.sortByYear);


    }

    @Override
    public void sortByYearAscendig(List<Movie> movies) {
        movies.sort(Movie.sortByYearAscendin);
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(Movie.sortMyDirector);

    }
}
