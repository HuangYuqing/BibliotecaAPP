package com.twu28.biblioteca.Util;

import com.twu28.biblioteca.Models.User;

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
    Scanner input ;

    public UserInteraction() {
        this.input = new Scanner(System.in);
    }

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

        return input.nextLine();
    }

    public void output(String info){
        System.out.println(info);
    }

    public User input2() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
