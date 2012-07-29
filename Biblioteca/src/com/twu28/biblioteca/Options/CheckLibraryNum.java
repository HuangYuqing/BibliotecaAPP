package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.UserInteraction;

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
        haveLogged = false;
    }

    public CheckLibraryNum(boolean haveLagged, User user) {
        this.haveLogged = haveLagged;
        this.user = user;
    }

    public void doOption(){
        if(haveLogged){
            new UserInteraction().output(user.userName);
        }else{
            new UserInteraction().output(Messages.CheckLibraryNum);
        }
    }
}
