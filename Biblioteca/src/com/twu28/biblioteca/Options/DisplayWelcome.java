package com.twu28.biblioteca.Options;


import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 9:17 AM
 */
public class DisplayWelcome extends Option {

    public DisplayWelcome(){
        optionName = "Display welcome";
        needLogin = false;
    }

    public void doOption(){
        Utils.displayInfo(Messages.PROLOGUE);
    }
}
