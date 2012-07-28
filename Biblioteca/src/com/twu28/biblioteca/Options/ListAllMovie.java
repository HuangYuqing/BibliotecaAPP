package com.twu28.biblioteca.Options;


import com.twu28.biblioteca.Models.Movie;
import com.twu28.biblioteca.Util.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 10:13 PM
 */
public class ListAllMovie extends Option{
    List<Movie> movieList;

    public ListAllMovie(){
        optionName = "List all movies";
        needLogin = false;
    }

    public ListAllMovie(List<Movie> movieList) {
        optionName = "List all movies";
        needLogin = false;
        this.movieList = movieList;
    }

    public void doOption(){
        for(Movie movie : getMovieList()){
            Utils.displayInfo(movie.getMovieName() + "  " + movie.getMovieDirector() + "  " + movie.getMovieRating());
        }
    }
    public List<Movie> getMovieList(){
        return movieList;
    }
}
