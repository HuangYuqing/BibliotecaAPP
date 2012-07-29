package com.twu28.biblioteca.Options;


import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Util.UserInteraction;

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
        new UserInteraction().output("All the books:");
        for(Book book : bookList){
            new UserInteraction().output(book.getBookName());
        }
    }

    public List<Book> getBookList(){
        return bookList;
    }
}
