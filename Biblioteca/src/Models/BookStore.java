package Models;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 11:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookStore {
    List<Book> books;

    public BookStore() {
    }

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }
}
