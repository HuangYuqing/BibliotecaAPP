package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.UserInteraction;
import com.twu28.biblioteca.Util.UserListBuilder;

import java.util.List;

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
           new UserInteraction().output(Messages.LoginSuc);
           user = validateUserInfo();

        }else {
           new UserInteraction().output(Messages.LoginFail);
       }
    }

    private void inputUserInfo() {
        new UserInteraction().output("Please login");

        new UserInteraction().output("input your username: ");
        user.userName = new UserInteraction().input();
        new UserInteraction().output("input your password: ");
        user.userPassword = new UserInteraction().input();
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
