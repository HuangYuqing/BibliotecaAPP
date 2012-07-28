package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Options.CheckLibraryNum;
import com.twu28.biblioteca.Util.Messages;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 3:51 PM
 */
public class CheckLibraryNumTest {
    ByteArrayOutputStream outPutStream;
    PrintStream out;

    @Before
    public void setUp() throws Exception {
        outPutStream = new ByteArrayOutputStream();
        out = new PrintStream(outPutStream);
        System.setOut(out);
    }

    @Test
    public void testCheckLibraryNumWithLoggedIn() throws Exception {
        User user = new User("111-1111", "password#1", "Librarian");

        CheckLibraryNum option = new CheckLibraryNum(true, user);
        option.doOption();

        Assert.assertEquals("111-1111\n", new String(outPutStream.toByteArray()));

    }

    @Test
    public void testCheckLibraryNumWithNonLoggedIn() throws Exception {

        User user = new User();

        CheckLibraryNum option = new CheckLibraryNum(false, user);
        option.doOption();

        Assert.assertEquals(Messages.CheckLibraryNum + "\n", new String(outPutStream.toByteArray()));
    }
}
