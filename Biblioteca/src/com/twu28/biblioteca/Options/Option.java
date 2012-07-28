package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.User;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 2:13 PM
 */
public abstract class Option {

    public String optionName;
    public boolean needLogin;
    public boolean haveLogged;

    User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void doOption(){}
}
