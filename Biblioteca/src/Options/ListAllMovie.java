package Options;

import Models.Movie;
import Models.MovieStore;
import Util.MovieStoreBuilder;

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

    public String DoOption(){
        for(Movie movie : movieStore.getMovies()){
            System.out.println(movie.movieName + "  " + movie.movieDirector + "  " + movie.movieRating);
        }
        return null;
    }
}
