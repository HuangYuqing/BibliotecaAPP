package Util;

import Models.User;
import Models.UserList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserListBuilder {
    public static UserList TempUserList(){
        User user1 = new User("111-1111","password#1", "Librarian");
        User user2 = new User("111-1112","password#2", "User");
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        UserList userList = new UserList(users);
        return  userList;
    }
}
