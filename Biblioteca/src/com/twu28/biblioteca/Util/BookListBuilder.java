package com.twu28.biblioteca.Util;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Repositories.IBookListGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 5:44 PM
 */
public class BookListBuilder implements IBookListGenerator {

    @Override
    public List<Book> generator() {
        Book book_1 = new Book("bookA", 10, 3);
        Book book_2 = new Book("bookB", 8, 0);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book_1);
        bookList.add(book_2);

        return bookList;
    }
}
