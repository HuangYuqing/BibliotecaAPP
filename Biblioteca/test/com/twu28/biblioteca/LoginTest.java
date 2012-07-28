package com.twu28.biblioteca;

import com.twu28.biblioteca.Options.Login;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 11:24 PM
 */
public class LoginTest {
    ByteArrayOutputStream outPutStream;
    ByteArrayInputStream in;
    PrintStream out;

    @Before
    public void setUp() throws Exception {
        outPutStream = new ByteArrayOutputStream();
        out = new PrintStream(outPutStream);
        System.setOut(out);
    }

    @Test
    public void shouldNotLoginWithNonexistUser() throws Exception {

        Login login = new Login();
        in = new ByteArrayInputStream("111-2222 password#1".getBytes());
        System.setIn(in);

        login.doOption();

        Assert.assertEquals("Please login\ninput your username: \ninput your password: \nLogin fail\n", new String(outPutStream.toByteArray()));
    }

    @Test
    public void shouldLoginWithExistUser() throws Exception {
        Login login = new Login();
        in = new ByteArrayInputStream("111-1111 password#1".getBytes());
        System.setIn(in);

        login.doOption();

        Assert.assertEquals("Please login\ninput your username: \ninput your password: \nLogin success\n", new String(outPutStream.toByteArray()));
    }
}
