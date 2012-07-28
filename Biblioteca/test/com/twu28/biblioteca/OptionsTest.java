package com.twu28.biblioteca;

import com.twu28.biblioteca.Options.Options;
import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 11:00 AM
 */
public class OptionsTest {
    Options options = new Options();

    @Test()
    public void testListOption() throws Exception {
        ByteArrayOutputStream outPutStream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outPutStream);
        System.setOut(out);

        options.listOption();

        String expected =   "1. Check library num\n2. List all books\n3. Reserve a book\n4. List all movies\n";
        Assert.assertEquals(expected, new String(outPutStream.toByteArray()));
    }

    @Test()
    public void testInvalidInputChoose() throws Exception {
        int optionNum = 6;
        ByteArrayOutputStream outPutStream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outPutStream);
        System.setOut(out);

        options.validateChoose(optionNum);

        Assert.assertEquals("Select a valid option!!\n", new String(outPutStream.toByteArray()));
    }

    //How to test : "A customer should be able to select a menu option."
}
