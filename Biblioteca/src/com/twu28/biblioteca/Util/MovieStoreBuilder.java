package com.twu28.biblioteca.Util;

import com.twu28.biblioteca.Models.Movie;
import com.twu28.biblioteca.Models.MovieStore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieStoreBuilder {

    public static MovieStore TempMovieStore(){
        List<Movie> movieList = new ArrayList<Movie>();
        Movie movie1 = new Movie("SholayRamesh", "Sippy", "N/A");
        Movie movie2 = new Movie("Caught in the Web", "Kaige Chen", "8");
        Movie movie3 = new Movie("The Trueman Show", "Peter Weir", "9");
        Movie movie4 = new Movie("Ice Age: Continental Drift", "Mike Thurmeier/Steve Martino", "N/A");
        Movie movie5 = new Movie("Ted", "Seth MacFarlane", "N/A");
        Movie movie6 = new Movie("Hustle & Flow", "Craig Brewer", "8");
        Movie movie7 = new Movie("The Simpsons Movie", "David Silverman", "8");
        Movie movie8 = new Movie("Three Idiots", "Rajkumar Hirani", "9");
        Movie movie9 = new Movie("Spirited Away", "Hayao Miyazaki", "8");
        Movie movie10 = new Movie("a", "b", "1");
        Movie movie11 = new Movie("a", "b", "2");
        Movie movie12 = new Movie("a", "b", "3");
        Movie movie13 = new Movie("a", "b", "4");
        Movie movie14 = new Movie("a", "b", "5");
        Movie movie15 = new Movie("a", "b", "6");

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
        movieList.add(movie7);
        movieList.add(movie8);
        movieList.add(movie9);
        movieList.add(movie10);
        movieList.add(movie11);
        movieList.add(movie12);
        movieList.add(movie13);
        movieList.add(movie14);
        movieList.add(movie15);

        return new MovieStore(movieList);

    }
}
