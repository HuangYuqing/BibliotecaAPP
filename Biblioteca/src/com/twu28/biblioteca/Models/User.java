package com.twu28.biblioteca.Models;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    public String userName;
    public String userPassword;
    public String userRole;

    public User(String userName, String userPassword, String userRole) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }
}
