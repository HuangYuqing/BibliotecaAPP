package com.twu28.biblioteca.Util;

import com.twu28.biblioteca.Models.BookStore;
import com.twu28.biblioteca.Models.MovieStore;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/25/12
 * Time: 8:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Utils {
    public static BookStore bookStore = (new BookStoreBuilder()).TempBookStore();
    public static MovieStore movieStore = (new MovieStoreBuilder()).TempMovieStore();

    public static void DisplayInfo(Object info){
        System.out.println(info);
    }
}
