package Options;

import Util.Messages;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 9:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class DisplayWelcome extends Option {

    public DisplayWelcome(){
        optionName = "Display welcome";
        needLogin = false;
    }

    public String DoOption(){
        System.out.println(Messages.PROLOGUE);
        return Messages.PROLOGUE;
    }
}
