package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.Parameters;
import com.twu28.biblioteca.Util.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckLibraryNum extends Option {

    public CheckLibraryNum(){
        optionName = "Check library num";
        needLogin = true;
    }

    public void DoOption(){
        if(LibraryNumToDisplay() == Messages.CheckLibraryNum){
            Utils.DisplayInfo(Messages.CheckLibraryNum);
        }else{
            Utils.DisplayInfo(Parameters.loginUser.userName);
        }
    }
    public String LibraryNumToDisplay(){
        if(Parameters.loginFlag == true){
            return Parameters.loginUser.userName;
        } else {
            return Messages.CheckLibraryNum;
        }
    }
}
