package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Models.BookStore;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.Utils;

import java.util.List;
import java.util.Scanner;

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

    public void InputBookName(){
        Scanner input = new Scanner(System.in);
        bookToReserve = input.next();
    }

    public void doOption(){
        InputBookName();

        if(bookCanBeReserved(bookToReserve) != null){
            Book book = bookStore.getBook(bookToReserve);
            int bookCount = book.getBookMaxBLNum();
            book.setBookMaxBLNum(--bookCount);
            Utils.displayInfo(Messages.ReserveSuc);
        }   else {
            Utils.displayInfo(Messages.ReserveFail);
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
