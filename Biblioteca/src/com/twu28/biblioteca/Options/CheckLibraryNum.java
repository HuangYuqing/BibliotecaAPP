package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 3:50 PM
 */
public class CheckLibraryNum extends Option {

    public CheckLibraryNum(){
        optionName = "Check library num";
        needLogin = true;
    }

    public CheckLibraryNum(boolean haveLagged, User user) {
        this.haveLogged = haveLagged;
        this.user = user;
    }

    public void doOption(){
        if(haveLogged){
            Utils.displayInfo(user.userName);
        }else{
            Utils.displayInfo(Messages.CheckLibraryNum);
        }
    }
}
