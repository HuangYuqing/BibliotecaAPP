package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Options.ReserveBook;
import com.twu28.biblioteca.Util.Utils;
import junit.framework.Assert;
import org.junit.Test;


/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 12:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReserveBookTest {
    @Test
    public void testDoOptionWhenBookCanBeReserved() throws Exception {
        int count = 0;

        String bookToReserve = "bookA";
        ReserveBook reserve = new ReserveBook();
        reserve.SetBookToReserve(bookToReserve);

        Book book = reserve.BookCanBeReserved(bookToReserve);
        if (book != null){ count = Utils.bookStore.getBook(book.bookName).bookMaxBLNum; }

        reserve.DoOption();

        count--;
        Assert.assertEquals(count, Utils.bookStore.getBook(book.bookName).bookMaxBLNum);
    }
    @Test
    public void testDoOptionWhenBookCannotBeReserved() throws Exception {
        String reserveResult;

        String bookToReserve = "bookC";
        ReserveBook reserve = new ReserveBook();
        reserve.SetBookToReserve(bookToReserve);
        Book book = reserve.BookCanBeReserved(bookToReserve);


        Assert.assertEquals(null, book);
    }
}
