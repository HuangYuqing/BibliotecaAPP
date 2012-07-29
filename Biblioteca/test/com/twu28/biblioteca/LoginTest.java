package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Options.Login;
import com.twu28.biblioteca.Repositories.IBookListGenerator;
import com.twu28.biblioteca.Util.UserInteraction;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        userInteraction = mock(UserInteraction.class);
    }

    @Test
    public void shouldNotLoginWithNonexistUser() throws Exception {

        //userInteraction.userInput("111-2222\npassword#1\n");
        when(userInteraction.input2()).thenReturn((new User("111-2222","password#1","")));

        Login login = new Login();
        login.setUser(userInteraction.input2());
        login.loginResult();

        Assert.assertEquals("Login fail\n", outPutStr.toString());
    }

    @Test
    public void shouldLoginWithExistUser() throws Exception {

        when(userInteraction.input2()).thenReturn((new User("111-1111","password#1","")));

        Login login = new Login();
        login.setUser(userInteraction.input2());
        login.loginResult();

        Assert.assertEquals("Login success\n", outPutStr.toString());
    }
}
