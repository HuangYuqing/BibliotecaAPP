package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.UserListBuilder;
import com.twu28.biblioteca.Util.Utils;

import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 11:23 PM
 */
public class Login extends Option {

    public Login(){
        optionName = "Login";
        user = new User();
    }

    public void doOption(){

       inputUserInfo();

       if(validateUserInfo() != null){
           Utils.displayInfo(Messages.LoginSuc);
           user = validateUserInfo();

        }else {
           Utils.displayInfo(Messages.LoginFail);
       }
    }

    private void inputUserInfo() {
        Utils.displayInfo("Please login");
        Scanner input = new Scanner(System.in);

        Utils.displayInfo("input your username: ");
        user.userName = input.next();
        Utils.displayInfo("input your password: ");
        user.userPassword = input.next();
    }

    public User validateUserInfo() {
        List<User> users = UserListBuilder.TempUserList().getUserList();
        for (User user : users){
            if(user.userName.equals(this.user.userName) && user.userPassword.equals(this.user.userPassword)) {
                return user;
            }
        }
        return null;
    }
}
