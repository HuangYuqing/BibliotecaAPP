import Models.User;
import Options.DisplayWelcome;
import Util.Options;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 6:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyLibrary {


    public static void WorkFlowOfOptions(){
        Options options = new Options();
        options.ListOption();
        int optionNum = options.InputChoose();
        options.validateChoose(optionNum);
    }
    public static void main(String args[]){
        new DisplayWelcome().DoOption();
        WorkFlowOfOptions();
    }
}
