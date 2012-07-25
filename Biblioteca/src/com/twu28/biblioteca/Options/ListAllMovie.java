package com.twu28.biblioteca.Options;


import com.twu28.biblioteca.Models.Movie;
import com.twu28.biblioteca.Models.MovieStore;
import com.twu28.biblioteca.Util.MovieStoreBuilder;
import com.twu28.biblioteca.Util.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListAllMovie extends Option{
    MovieStore movieStore;

    public ListAllMovie(){
        optionName = "List all movies";
        needLogin = false;
        movieStore = MovieStoreBuilder.TempMovieStore();
    }

    public void DoOption(){
        for(Movie movie : GetMovieList()){
            Utils.DisplayInfo(movie.movieName + "  " + movie.movieDirector + "  " + movie.movieRating);
        }
    }
    public List<Movie> GetMovieList(){
        return movieStore.getMovies();
    }
}
