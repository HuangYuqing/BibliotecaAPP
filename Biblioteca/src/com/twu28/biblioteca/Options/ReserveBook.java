package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Models.BookStore;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.UserInteraction;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 12:46 PM
 */
public class ReserveBook extends Option {
    String bookToReserve;
    BookStore bookStore;

    public ReserveBook() {
        optionName = "Reserve a book";
        needLogin = false;
    }
    public ReserveBook(List<Book> bookList){
        bookStore = new BookStore(bookList);
    }

    public void doOption(){
        bookToReserve = new UserInteraction().input();

        if(bookCanBeReserved(bookToReserve) != null){
            Book book = bookStore.getBook(bookToReserve);
            int bookCount = book.getBookMaxBLNum();
            book.setBookMaxBLNum(--bookCount);
            new UserInteraction().output(Messages.ReserveSuc);
        }   else {
            new UserInteraction().output(Messages.ReserveFail);
        }
    }

    public Book bookCanBeReserved(String bookName){
        if(bookStore.getBook(bookName) != null && bookStore.getBook(bookName).getBookMaxBLNum() > 0) {
            return bookStore.getBook(bookName);
        }   else {
            return null;
        }
    }
}
