package Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Options.*;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/22/12
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Options {

    List<Option> optionList = new ArrayList<Option>();

    public Options(){
        Option option1 = new CheckLibraryNum();
        Option option2 = new ListAllBooks();
        Option option3 = new ReserveBook();
        Option option4 = new ListAllMovie();

        optionList.add(option1);
        optionList.add(option2);
        optionList.add(option3);
        optionList.add(option4);
    }

    public void ListOption(){
        int i = 0;
        for (Object option : optionList.toArray()) {
            i ++;
            System.out.println(i + ": "+ ((Option)option).optionName);
        }
    }


    public int InputChoose() {
        System.out.print("Input your choose: ");
        int optionNum = 0;

        Scanner input = new Scanner(System.in);
        optionNum = input.nextInt();

        return optionNum;
    }

    public String validateChoose(int optionNum){
        if (optionNum < 1 || optionNum > optionList.size()){
            System.out.println(Messages.InvalidChoose);
            return Messages.InvalidChoose;
        }else {
            return ChooseOption(optionNum);
        }
    }

    public String ChooseOption(int optionNum){
        Option option = optionList.get(optionNum - 1);
        if(option.needLogin == false){
            option.DoOption();
        }else {
            new Login().DoOption();
            option.DoOption();
        }
        return option.optionName;
    }
}
