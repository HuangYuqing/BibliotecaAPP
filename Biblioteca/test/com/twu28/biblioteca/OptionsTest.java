package com.twu28.biblioteca;

import com.twu28.biblioteca.Models.Book;
import com.twu28.biblioteca.Options.ListAllBooks;
import com.twu28.biblioteca.Options.Option;
import com.twu28.biblioteca.Options.Options;
import com.twu28.biblioteca.Repositories.IBookListGenerator;
import com.twu28.biblioteca.Util.UserInteraction;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    public void testSelectOption() throws Exception {

        Option option = options.chooseOption(1);
        Assert.assertEquals("Check library num", option.optionName);

        option = options.chooseOption(2);
        Assert.assertEquals("List all books", option.optionName);

        option = options.chooseOption(3);
        Assert.assertEquals("Reserve a book", option.optionName);

        option = options.chooseOption(4);
        Assert.assertEquals("List all movies", option.optionName);
    }
}
