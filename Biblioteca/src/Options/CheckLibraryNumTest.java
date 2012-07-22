package Options;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckLibraryNumTest {
    @Test
    public void testDoOption() throws Exception {
        CheckLibraryNum option = new CheckLibraryNum();
        Assert.assertEquals("Please talk to Librarian. Thank you.",option.DoOption());
    }
}
