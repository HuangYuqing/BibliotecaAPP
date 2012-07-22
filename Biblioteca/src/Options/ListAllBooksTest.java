package Options;

import Models.Book;
import Models.BookStore;
import Util.BookStoreBuilder;
import org.junit.Test;

import java.util.ArrayList;
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

        BookStore bookStore = BookStoreBuilder.TempBookStore();
        ListAllBooks option = new ListAllBooks(bookStore);

        option.DoOption();
    }
}
