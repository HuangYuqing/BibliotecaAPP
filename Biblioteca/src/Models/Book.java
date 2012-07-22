package Models;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 9:08 AM
 * To change this template use File | Settings | File Templates.
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
}
