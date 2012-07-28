package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Options.CheckLibraryNum;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.UserInteraction;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 3:51 PM
 */
public class CheckLibraryNumTest {
    ByteArrayOutputStream outPutStr;

    @Before
    public void setUp() throws Exception {
        outPutStr = new UserInteraction().userOutput();
    }

    @Test
    public void testCheckLibraryNumWithLoggedIn() throws Exception {
        User user = new User("111-1111", "password#1", "Librarian");

        CheckLibraryNum option = new CheckLibraryNum(true, user);
        option.doOption();

        Assert.assertEquals("111-1111\n", outPutStr.toString());

    }

    @Test
    public void testCheckLibraryNumWithNonLoggedIn() throws Exception {

        User user = new User();

        CheckLibraryNum option = new CheckLibraryNum(false, user);
        option.doOption();

        Assert.assertEquals(Messages.CheckLibraryNum + "\n", outPutStr.toString());
    }
}
