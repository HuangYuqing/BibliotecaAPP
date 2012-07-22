package Options;

import Models.Book;
import Models.BookStore;
import Util.BookStoreBuilder;
import Util.Messages;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 12:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReserveBook extends Option {
    BookStore bookStore;
    String bookToReserve;

    public ReserveBook() {
        optionName = "Reserve a book";
        needLogin = false;
        bookStore = BookStoreBuilder.TempBookStore();
        bookToReserve = "NeedToInput";
    }

    public void SetBookToReserve(String bookToReserve) {
        bookToReserve = bookToReserve;
    }

    public void InputBookName(){
        System.out.print("input book name: ");
        Scanner input = new Scanner(System.in);
        bookToReserve = input.next();
    }

    public String DoOption(){
        if(bookToReserve == "NeedToInput"){
            InputBookName();
        }
        for (Book book : bookStore.getBooks()){
            if (book.getBookName().equals(bookToReserve) && book.getBookMaxBLNum() > 0){
                System.out.println(Messages.ReserveSuc);
                return Messages.ReserveSuc;
            }
        }
        System.out.println(Messages.ReserveFail);
        return Messages.ReserveFail;
    }
}
