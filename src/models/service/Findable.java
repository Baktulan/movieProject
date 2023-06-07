package models.service;

import models.Movie;

import java.util.List;

public interface Findable {
    List<Movie> getAllMovies(List<Movie>movies);

    void findMovieByFullNameOrPartName(List<Movie>movies);

    void findMovieByActorName(List<Movie>movies);

    void findMovieByYear(List<Movie>movies);

    void findMovieByDirector(List<Movie>movies);

    void findMovieByGenre(List<Movie>movies);

    void findMovieByRole(List<Movie>movies);
}
