package Util;

import Models.Book;
import Models.BookStore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 5:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookStoreBuilder {

    public static BookStore TempBookStore(){
        Book book_1 = new Book("bookA", 10, 3);
        Book book_2 = new Book("bookB", 8, 0);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book_1);
        bookList.add(book_2);

        BookStore bookStore = new BookStore(bookList);
        return bookStore;
    }
}
