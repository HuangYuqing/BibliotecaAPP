package Util;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 11:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class OptionsTest {
    Options options = new Options();

    @Test()
    public void testListOption() throws Exception {
        options.ListOption();
    }

    @Test()
    public void testChooseOption() throws Exception {
        int optionNum = 1;
        Assert.assertEquals("Check library num", options.ChooseOption(optionNum));
    }

    @Test()
    public void testInvalidInputChoose() throws Exception {
        int optionNum = 4;
        String chooseResult = options.validateChoose(optionNum);
        switch (optionNum){
            case 1:
                Assert.assertEquals("Check library num", chooseResult);
            case 2:
                Assert.assertEquals("List all books", chooseResult);
            case 3:
                Assert.assertEquals("Reserve a book", chooseResult);
            default:
                Assert.assertEquals(Messages.InvalidChoose, chooseResult);
        }
    }
    @Test()
    public void testValidInputChoose() throws Exception {
        int optionNum = 2;
        String chooseResult = options.validateChoose(optionNum);
        switch (optionNum){
            case 1:
                Assert.assertEquals("Check library num", chooseResult);
                break;
            case 2:
                Assert.assertEquals("List all books", chooseResult);
                break;
            case 3:
                Assert.assertEquals("Reserve a book", chooseResult);
                break;
            default:
                Assert.assertEquals(Messages.InvalidChoose, chooseResult);
        }
    }
}
