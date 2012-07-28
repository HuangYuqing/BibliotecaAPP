package com.twu28.biblioteca.Models;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 11:18 AM
 */
public class BookStore {
    List<Book> books;


    public BookStore(List<Book> bookList) {
        this.books = bookList;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(String bookName) {
        for (Book book : books){
            if (bookName.equals(book.bookName)) return book;
        }
        return null;
    }
}
