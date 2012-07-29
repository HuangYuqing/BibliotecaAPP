package com.twu28.biblioteca;

import com.twu28.biblioteca.Options.Login;
import com.twu28.biblioteca.Util.UserInteraction;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 11:24 PM
 */
public class LoginTest {
    ByteArrayOutputStream outPutStr;
    UserInteraction userInteraction;

    @Before
    public void setUp() throws Exception {
        outPutStr = new UserInteraction().userOutput();
        userInteraction = new UserInteraction();
    }

    @Test
    public void shouldNotLoginWithNonexistUser() throws Exception {

        userInteraction.userInput("111-2222\npassword#1\n");

        Login login = new Login();
        login.doOption();

        Assert.assertEquals("Please login\ninput your username: \ninput your password: \nLogin fail\n", outPutStr.toString());
    }

    @Test
    public void shouldLoginWithExistUser() throws Exception {

        userInteraction.userInput("111-1111\npassword#1\n");

        Login login = new Login();
        login.doOption();

        Assert.assertEquals("Please login\ninput your username: \ninput your password: \nLogin success\n", outPutStr.toString());
    }
}
