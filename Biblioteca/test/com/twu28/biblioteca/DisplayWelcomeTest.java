package com.twu28.biblioteca;

import com.twu28.biblioteca.Options.DisplayWelcome;
import com.twu28.biblioteca.Util.UserInteraction;
import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;


/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 9:27 AM
 */
public class DisplayWelcomeTest {

    @Test
    public void testDoOption() throws Exception {
        ByteArrayOutputStream outPutStr = new UserInteraction().userOutput();
        new DisplayWelcome().doOption();
        Assert.assertEquals("Welcome\n", outPutStr.toString());
    }
}
