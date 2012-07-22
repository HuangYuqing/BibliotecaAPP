package Options;

import Models.Book;
import Models.BookStore;
import Util.BookStoreBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class ListAllBooks extends Option {
    BookStore bookStore;

    public ListAllBooks() {
        optionName = "List all books";
        needLogin = false;
        bookStore = BookStoreBuilder.TempBookStore();
    }

    public ListAllBooks(BookStore bookStore) {
        optionName = "List all books";
        this.bookStore = bookStore;
    }

    public String DoOption()
    {
        System.out.println("All the books:");
        for(Book book : bookStore.getBooks()){
            System.out.println(book.getBookName());
        }
        return "All book list";
    }
}
