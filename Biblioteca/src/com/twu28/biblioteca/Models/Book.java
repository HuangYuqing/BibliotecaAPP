package com.twu28.biblioteca.Models;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 9:08 AM
 */
public class Book {
    String bookName;
    int bookCount;
    int bookMaxBLNum;

    public Book(String bookName, int bookCount, int bookMaxBLNum) {
        this.bookName = bookName;
        this.bookCount = bookCount;

        this.bookMaxBLNum = bookMaxBLNum;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookMaxBLNum() {
        return bookMaxBLNum;
    }

    public void setBookMaxBLNum(int bookMaxBLNum) {
        this.bookMaxBLNum = bookMaxBLNum;
    }
}
