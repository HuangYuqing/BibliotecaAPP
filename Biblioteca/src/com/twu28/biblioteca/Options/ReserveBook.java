package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Models.BookStore;
import com.twu28.biblioteca.Util.BookStoreBuilder;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.Utils;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 12:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReserveBook extends Option {
    String bookToReserve;

    public ReserveBook() {
        optionName = "Reserve a book";
        needLogin = false;
        bookToReserve = "NeedToInput";
    }

    public void SetBookToReserve(String bookToReserve) {
        this.bookToReserve = bookToReserve;
    }

    public void InputBookName(){
        Utils.DisplayInfo("input book name: ");
        Scanner input = new Scanner(System.in);
        bookToReserve = input.next();
    }

    public void DoOption(){
        if(bookToReserve == "NeedToInput"){
            InputBookName();
        }

        if(BookCanBeReserved(bookToReserve) != null){
            Utils.bookStore.getBook(bookToReserve).bookMaxBLNum --;
            Utils.DisplayInfo(Messages.ReserveSuc);
        }   else {
            Utils.DisplayInfo(Messages.ReserveFail);
        }
    }

    public Book BookCanBeReserved(String bookName){
        if(Utils.bookStore.getBook(bookName) != null && Utils.bookStore.getBook(bookName).bookMaxBLNum > 0) {
            return Utils.bookStore.getBook(bookName);
        }   else {
            return null;
        }
    }
}
