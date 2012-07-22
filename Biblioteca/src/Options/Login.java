package Options;

import Models.User;
import Util.Parameters;
import Util.UserListBuilder;
import Util.Messages;

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

    public String DoOption(){
        if(user.userName == "N/A"){
            InputUserInfo();
        }
       if(ValidateUserInfo(user)){
           System.out.println(Messages.LoginSuc);
           Parameters.loginFlag = true;
           Parameters.loginUser = user;
           return Messages.LoginSuc;
        }else {
           System.out.println(Messages.LoginFail);
           return Messages.LoginFail;
       }
    }

    private void InputUserInfo() {
        System.out.println("Please login");
        Scanner input = new Scanner(System.in);

        System.out.print("input your username: ");
        user.userName = input.next();

        System.out.print("input your password: ");
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
