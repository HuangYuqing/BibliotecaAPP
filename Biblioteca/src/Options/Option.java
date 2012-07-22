package Options;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 2:13 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Option {

    public String optionName;
    public boolean needLogin;

    public String DoOption(){
        return this.optionName;
    };
}
