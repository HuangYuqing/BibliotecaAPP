package com.twu28.biblioteca;

import com.twu28.biblioteca.Options.DisplayWelcome;
import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 9:27 AM
 */
public class DisplayWelcomeTest {

    @Test
    public void testDoOption() throws Exception {
        ByteArrayOutputStream outPutStream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outPutStream);
        System.setOut(out);

        new DisplayWelcome().doOption();
        Assert.assertEquals("Welcome\n", new String(outPutStream.toByteArray()));
    }
}
