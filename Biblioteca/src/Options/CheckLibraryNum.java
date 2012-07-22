package Options;

import Util.Messages;
import Util.Parameters;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckLibraryNum extends Option {

    public CheckLibraryNum(){
        optionName = "Check library num";
        needLogin = true;
    }

    public String DoOption(){
        if(Parameters.loginFlag == true){
            System.out.println(Parameters.loginUser.userName);
            return Parameters.loginUser.userName;
        }else{
            System.out.println(Messages.CheckLibraryNum);
            return Messages.CheckLibraryNum;
        }
    }
}
