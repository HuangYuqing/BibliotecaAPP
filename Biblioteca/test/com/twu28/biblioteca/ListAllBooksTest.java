package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Options.ListAllBooks;
import com.twu28.biblioteca.Repositories.IBookListGenerator;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 12:45 PM
 */
public class ListAllBooksTest {

    IBookListGenerator mockedBookList;
    //how to test without actual data??? bookList??

    @Before
    public void setUp() throws Exception {

        mockedBookList = mock(IBookListGenerator.class);
        when(mockedBookList.generator()).thenReturn(Arrays.asList(new Book("bookA", 10, 4)));
    }

    @Test
    public void shouldListAllBooks() throws Exception {
        ListAllBooks option = new ListAllBooks(mockedBookList.generator());
        option.doOption();

        Assert.assertEquals("bookA",option.getBookList().get(0).getBookName());

    }
}
