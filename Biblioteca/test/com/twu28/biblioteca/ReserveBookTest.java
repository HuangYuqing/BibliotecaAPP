package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Models.BookStore;
import com.twu28.biblioteca.Options.ReserveBook;
import com.twu28.biblioteca.Repositories.IBookListGenerator;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

    ByteArrayOutputStream outPutStream;
    ByteArrayInputStream in;
    PrintStream out;
    //how to test without actual data??? bookList??

    @Before
    public void setUp() throws Exception {

        mockedBookList = mock(IBookListGenerator.class);
        when(mockedBookList.generator()).thenReturn(Arrays.asList(new Book("bookA", 10, 4), new Book("bookB", 8, 0)));

        reserve = new ReserveBook(mockedBookList.generator());

        outPutStream = new ByteArrayOutputStream();
        out = new PrintStream(outPutStream);
        System.setOut(out);
    }

    //decouple test and actual data --- mock data
    @Test
    public void testReserveBookWhenBookCanBeReserved() throws Exception {
        int count;

        in = new ByteArrayInputStream("bookA".getBytes());
        System.setIn(in);

        count = new BookStore(mockedBookList.generator()).getBook("bookA").getBookMaxBLNum();

        reserve.doOption();
        count--;

        Assert.assertEquals(count, new BookStore(mockedBookList.generator()).getBook("bookA").getBookMaxBLNum());

        Assert.assertEquals("Thank You! Enjoy the book.\n", new String(outPutStream.toByteArray()));

    }
    @Test
    public void testReserveBookWhenBookCannotBeReserved() throws Exception {

        in = new ByteArrayInputStream("bookC".getBytes());
        System.setIn(in);

        reserve.doOption();
        Assert.assertEquals("Sorry we don't have that book yet.\n", new String(outPutStream.toByteArray()));


    }
}
