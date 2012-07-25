package com.twu28.biblioteca.Models;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 9:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    public String movieName;
    public String movieDirector;
    public String movieRating;

    public Movie(String movieName, String movieDirector, String movieRating) {

        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;

    }
}
