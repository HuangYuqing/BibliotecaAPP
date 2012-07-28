package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Models.BookStore;
import com.twu28.biblioteca.Options.ReserveBook;
import com.twu28.biblioteca.Repositories.IBookListGenerator;
import com.twu28.biblioteca.Util.UserInteraction;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 12:47 PM
 */
public class ReserveBookTest {
    IBookListGenerator mockedBookList;
    ReserveBook reserve;

    ByteArrayOutputStream outPutStr;

    @Before
    public void setUp() throws Exception {

        mockedBookList = mock(IBookListGenerator.class);
        when(mockedBookList.generator()).thenReturn(Arrays.asList(new Book("bookA", 10, 4), new Book("bookB", 8, 0)));

        reserve = new ReserveBook(mockedBookList.generator());

        outPutStr = new UserInteraction().userOutput();
    }

    //decouple test and actual data --- mock data
    @Test
    public void testReserveBookWhenBookCanBeReserved() throws Exception {
        int count;

        new UserInteraction().userInput("bookA");

        count = new BookStore(mockedBookList.generator()).getBook("bookA").getBookMaxBLNum();

        reserve.doOption();
        count--;

        Assert.assertEquals(count, new BookStore(mockedBookList.generator()).getBook("bookA").getBookMaxBLNum());

        Assert.assertEquals("Thank You! Enjoy the book.\n", outPutStr.toString());

    }
    @Test
    public void testReserveBookWhenBookCannotBeReserved() throws Exception {

        new UserInteraction().userInput("bookC");

        reserve.doOption();
        Assert.assertEquals("Sorry we don't have that book yet.\n", outPutStr.toString());

    }
}
