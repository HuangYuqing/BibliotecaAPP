package com.twu28.biblioteca.Models;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 9:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    public String bookName;
    public int bookCount;
    public int bookMaxBLNum;

    public Book(String bookName, int bookCount, int bookMaxBLNum) {
        this.bookName = bookName;
        this.bookCount = bookCount;

        this.bookMaxBLNum = bookMaxBLNum;
    }
}
