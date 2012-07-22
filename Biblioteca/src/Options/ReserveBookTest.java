package Options;

import Models.Book;
import Models.BookStore;
import Util.BookStoreBuilder;
import Util.Messages;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        String reserveResult;

        String bookToReserve = "bookA";
        ReserveBook reserve = new ReserveBook();
        reserve.SetBookToReserve(bookToReserve);
        reserveResult = reserve.DoOption();

        Assert.assertEquals(Messages.ReserveSuc,reserveResult);
    }
    @Test
    public void testDoOptionWhenBookCannotBeReserved() throws Exception {
        String reserveResult;

        String bookToReserve = "bookC";
        ReserveBook reserve = new ReserveBook();
        reserve.SetBookToReserve(bookToReserve);
        reserveResult = reserve.DoOption();

        Assert.assertEquals(Messages.ReserveFail, reserveResult);
    }
}
