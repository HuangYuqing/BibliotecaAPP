package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.Parameters;
import com.twu28.biblioteca.Util.UserListBuilder;
import com.twu28.biblioteca.Util.Utils;

import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Login extends Option {
    User user = new User("N/A", "N/A", "User");

    public Login(){
        optionName = "Login";
    }

    public void setUser(User userToSet) {
        user = userToSet;
    }

    public void DoOption(){
        if(user.userName == "N/A"){
            InputUserInfo();
        }
       if(ValidateUserInfo(user)){
           Utils.DisplayInfo(Messages.LoginSuc);
           Parameters.loginFlag = true;
           Parameters.loginUser = user;
        }else {
           Utils.DisplayInfo(Messages.LoginFail);
       }
    }

    private void InputUserInfo() {
        Utils.DisplayInfo("Please login");
        Scanner input = new Scanner(System.in);

        Utils.DisplayInfo("input your username: ");
        user.userName = input.next();

        Utils.DisplayInfo("input your password: ");
        user.userPassword = input.next();
    }

    private boolean ValidateUserInfo(User loginUser) {
        List<User> users = UserListBuilder.TempUserList().getUserList();
        for (User user : users){
            if(user.userName.equals(loginUser.userName) && user.userPassword.equals(loginUser.userPassword)) {
                return true;
            }
        }
        return false;
    }
}
