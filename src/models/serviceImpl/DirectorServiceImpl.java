package models.serviceImpl;

import models.DataBase;
import models.Movie;
import models.service.Findable;

import java.util.List;

public class DirectorServiceImpl implements Findable {
    private DataBase dataBase;

    public DirectorServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return null;
    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {

    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {

    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {

    }

    @Override
    public void findMovieByRole(List<Movie> movies) {

    }
}
