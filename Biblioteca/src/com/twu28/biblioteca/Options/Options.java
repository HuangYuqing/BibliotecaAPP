package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Yuqing
 * Date: 7/22/12
 * Time: 9:11 AM
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

    public void listOption(){
        int i = 0;
        for (Object option : optionList.toArray()) {
            i ++;
            Utils.displayInfo(i + ". " + ((Option) option).optionName);
        }
    }


    public int inputChoose() {
        Utils.displayInfo("Input your choose: ");
        int optionNum;

        Scanner input = new Scanner(System.in);
        optionNum = input.nextInt();

        return optionNum;
    }

    public void validateChoose(int optionNum){
        if (optionNum < 1 || optionNum > optionList.size()){
            Utils.displayInfo(Messages.InvalidChoose);
        }else {
            chooseOption(optionNum);
        }
    }

    public String chooseOption(int optionNum){
        Option option = optionList.get(optionNum - 1);
        if(!option.needLogin){
            option.doOption();
        }else {
            Login login = new Login();
            login.doOption();
            if(login.getUser() != null){
                option.haveLogged = true;
                option.setUser(login.user);
                option.doOption();
            }

        }
        return option.optionName;
    }
}
