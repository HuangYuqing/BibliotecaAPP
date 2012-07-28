package com.twu28.biblioteca.Models;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 9:19 PM
 */
public class Movie {
    String movieName;
    String movieDirector;
    String movieRating;

    public Movie(String movieName, String movieDirector, String movieRating) {

        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;

    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public String getMovieRating() {
        return movieRating;
    }
}
