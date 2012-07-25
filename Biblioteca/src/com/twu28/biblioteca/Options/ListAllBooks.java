package com.twu28.biblioteca.Options;


import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Models.BookStore;
import com.twu28.biblioteca.Util.BookStoreBuilder;
import com.twu28.biblioteca.Util.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class ListAllBooks extends Option {
    public ListAllBooks() {
        optionName = "List all books";
        needLogin = false;
    }

    public void DoOption()
    {
        Utils.DisplayInfo("All the books:");
        for(Book book : GetBookList()){
            Utils.DisplayInfo(book.bookName);
        }
    }

    public List<Book> GetBookList(){
        return Utils.bookStore.getBooks();
    }
}
