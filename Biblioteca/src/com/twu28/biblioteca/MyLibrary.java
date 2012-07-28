package com.twu28.biblioteca;

import com.twu28.biblioteca.Options.DisplayWelcome;
import com.twu28.biblioteca.Options.Options;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 6:07 PM
 */
public class MyLibrary {


    public static void workFlowOfOptions(){
        Options options = new Options();
        options.listOption();
        int optionNum = options.inputChoose();
        options.validateChoose(optionNum);
    }
    public static void main(String args[]){
        new DisplayWelcome().doOption();
        workFlowOfOptions();
    }
}
