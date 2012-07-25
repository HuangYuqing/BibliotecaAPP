package com.twu28.biblioteca;

import com.twu28.biblioteca.Options.DisplayWelcome;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 9:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class DisplayWelcomeTest {

    @Test
    public void testDoOption() throws Exception {
        String result = new DisplayWelcome().GetPrologue();
        Assert.assertEquals("Welcome", result);
    }
}
