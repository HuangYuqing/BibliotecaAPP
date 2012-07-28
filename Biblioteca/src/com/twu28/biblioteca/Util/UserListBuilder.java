package com.twu28.biblioteca.Util;

import com.twu28.biblioteca.Models.User;
import com.twu28.biblioteca.Models.UserList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 11:14 PM
 */
public class UserListBuilder {
    public static UserList TempUserList(){
        User user1 = new User("111-1111","password#1", "Librarian");
        User user2 = new User("111-1112","password#2", "User");
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        return new UserList(users);
    }
}
