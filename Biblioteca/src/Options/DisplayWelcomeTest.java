package Options;

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
    DisplayWelcome displayWelcome = new DisplayWelcome();

    @Test
    public void testDoOption() throws Exception {
        Assert.assertEquals("Welcome",displayWelcome.DoOption());

    }
}
