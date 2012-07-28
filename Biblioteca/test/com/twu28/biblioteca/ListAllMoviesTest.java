package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.Movie;
import com.twu28.biblioteca.Options.ListAllMovie;
import com.twu28.biblioteca.Repositories.IMovieListGenerator;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 10:18 PM
 */
public class ListAllMoviesTest {

    private IMovieListGenerator mockedMovieList;

    @Before
    public void setUp() throws Exception {

        mockedMovieList = mock(IMovieListGenerator.class);
        when(mockedMovieList.generator()).thenReturn(Arrays.asList(new Movie("movieA", "directerA", "N/A")));
    }


    @Test
    public void shouldListAllMovies() throws Exception {
        ListAllMovie option = new ListAllMovie(mockedMovieList.generator());
        List<Movie> movieList = option.getMovieList();
        option.doOption();

        Assert.assertEquals(1, movieList.size());
        Assert.assertEquals("movieA", option.getMovieList().get(0).getMovieName());
    }
}
