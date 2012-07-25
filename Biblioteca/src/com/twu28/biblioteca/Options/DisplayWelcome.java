package com.twu28.biblioteca.Options;


import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 9:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class DisplayWelcome extends Option {

    public DisplayWelcome(){
        optionName = "Display welcome";
        needLogin = false;
    }

    public void DoOption(){
        Utils.DisplayInfo(GetPrologue());
    }

    public String GetPrologue(){
        return Messages.PROLOGUE;
    }
}
