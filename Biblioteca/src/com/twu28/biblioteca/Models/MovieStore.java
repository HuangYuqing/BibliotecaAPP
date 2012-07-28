package com.twu28.biblioteca.Models;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 9:27 PM
 */
public class MovieStore {
    List<Movie> movies;

    public MovieStore(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
