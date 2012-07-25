package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Models.BookStore;
import com.twu28.biblioteca.Options.ListAllBooks;
import com.twu28.biblioteca.Util.Utils;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListAllBooksTest {
    @Test
    public void testDoOption() throws Exception {


        ListAllBooks option = new ListAllBooks();
        List<Book> bookList = option.GetBookList();

        Assert.assertEquals("bookA", bookList.get(0).bookName);
        Assert.assertEquals("bookB", bookList.get(1).bookName);

    }
}
