package com.twu28.biblioteca.Options;


import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Util.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 11:15 AM
 */
public class ListAllBooks extends Option {
    private List<Book> bookList;
    public ListAllBooks(List<Book> bookList) {
        optionName = "List all books";
        needLogin = false;
        this.bookList = bookList;
    }

    public ListAllBooks() {
        optionName = "List all books";
        needLogin = false;
    }

    public void doOption()
    {
        Utils.displayInfo("All the books:");
        for(Book book : bookList){
            Utils.displayInfo(book.getBookName());
        }
    }

    public List<Book> getBookList(){
        return bookList;
    }
}
