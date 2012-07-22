package Models;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserList {
    List<User> userList;

    public UserList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }
}
