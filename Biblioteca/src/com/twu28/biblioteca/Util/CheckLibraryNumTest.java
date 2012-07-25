package com.twu28.biblioteca.Util;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Options.Login;
import com.twu28.biblioteca.Util.Messages;
import junit.framework.Assert;
import org.junit.Test;
import com.twu28.biblioteca.Options.CheckLibraryNum;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckLibraryNumTest {
    @Test
    public void testCheckLibraryNumWithLoggedIn() throws Exception {
        Login login = new Login();
        login.setUser(new User("111-1112","password#2", "User"));
        login.DoOption();

        CheckLibraryNum option = new CheckLibraryNum();
        String checkResult = option.LibraryNumToDisplay();

        Assert.assertEquals("111-1112", checkResult);

        Parameters.loginFlag = false;
        Parameters.loginUser = null;

    }

    @Test
    public void testCheckLibraryNumWithNonLoggedIn() throws Exception {

        CheckLibraryNum option = new CheckLibraryNum();
        String checkResult = option.LibraryNumToDisplay();

        Assert.assertEquals(Messages.CheckLibraryNum, checkResult);

    }
}
