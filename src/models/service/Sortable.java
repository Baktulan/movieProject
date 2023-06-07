package models.service;

import models.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieName(List<Movie>movies);
    void sortByMovieName2(List<Movie>movies);

//-from A to Z

//-from Z to A

    void sortByYear(List<Movie>movies);
    void sortByYearAscendig(List<Movie>movies);

//-Ascending

//-Descending

    void sortByDirector(List<Movie>movies);

}
