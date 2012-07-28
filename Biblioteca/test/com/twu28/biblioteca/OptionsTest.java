package com.twu28.biblioteca;

import com.twu28.biblioteca.Options.Options;
import com.twu28.biblioteca.Util.UserInteraction;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 11:00 AM
 */
public class OptionsTest {
    Options options = new Options();
    ByteArrayOutputStream outPutStream;

    @Before
    public void setUp() throws Exception {
        outPutStream = new UserInteraction().userOutput();
    }

    @Test()
    public void testListOption() throws Exception {
        options.listOption();

        String expected =   "1. Check library num\n2. List all books\n3. Reserve a book\n4. List all movies\n";
        Assert.assertEquals(expected, outPutStream.toString());
    }

    @Test()
    public void testInvalidInputChoose() throws Exception {
        int optionNum = 6;
        options.validateChoose(optionNum);

        Assert.assertEquals("Select a valid option!!\n", outPutStream.toString());
    }

    //How to test : "A customer should be able to select a menu option."

    @Test
    public void testSelectListAllBooksOption() throws Exception {
        int optionNum = 1;

        options.chooseOption(optionNum);

        //这个是要按ListAllBooksTest里面的Assert吗？或者说只要确认能够选择这个Option?
    }
}
