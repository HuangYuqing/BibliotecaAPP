package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Options.Login;
import com.twu28.biblioteca.Util.Parameters;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 11:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginTest {
    @Test
    public void testDoOptionWithNonexistUser() throws Exception {
        User user = new User("111-2222", "password", "User");
        Login login = new Login();
        login.setUser(user);

        login.DoOption();
        Assert.assertEquals(false, Parameters.loginFlag);
    }

    @Test
    public void testDoOptionWithExistUser() throws Exception {
        User user = new User("111-1112", "password#2", "User");
        Login login = new Login();
        login.setUser(user);

        login.DoOption();
        Assert.assertEquals(true, Parameters.loginFlag);
    }
}
