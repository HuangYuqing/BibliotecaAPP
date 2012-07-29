package com.twu28.biblioteca.Util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/28/12
 * Time: 10:49 PM
 */
public class UserInteraction {
    public void userInput(String inputStr){
        ByteArrayInputStream in = new ByteArrayInputStream(inputStr.getBytes());
        System.setIn(in);
    }

    public ByteArrayOutputStream userOutput(){
        ByteArrayOutputStream outPutStream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outPutStream);
        System.setOut(out);
        return outPutStream;
    }

    public String input(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void output(String info){
        System.out.println(info);
    }
}
