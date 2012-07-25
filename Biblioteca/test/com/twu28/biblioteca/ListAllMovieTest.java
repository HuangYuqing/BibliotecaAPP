package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.Movie;
import com.twu28.biblioteca.Options.ListAllMovie;
import com.twu28.biblioteca.Util.Utils;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 10:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListAllMovieTest {
    @Test
    public void testDoOption() throws Exception {
        ListAllMovie option = new ListAllMovie();
        List<Movie> movieList = option.GetMovieList();

        for (int i = 0; i < 15; i++ ) {
            Assert.assertEquals(Utils.movieStore.getMovies().get(i).movieName, movieList.get(i).movieName);
        }
    }
}
