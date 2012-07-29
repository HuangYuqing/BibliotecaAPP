package com.twu28.biblioteca.Options;

import com.twu28.biblioteca.Util.Messages;
import com.twu28.biblioteca.Util.UserInteraction;

import java.util.ArrayList;
import java.util.List;

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
            new UserInteraction().output(i + ". " + ((Option) option).optionName);
        }
    }


    public int inputChoose() {
        new UserInteraction().output("Input your choose: ");
        int optionNum;

        optionNum = Integer.parseInt(new UserInteraction().input());

        return optionNum;
    }

    public void validateChoose(int optionNum){
        if (optionNum < 1 || optionNum > optionList.size()){
            new UserInteraction().output(Messages.InvalidChoose);
        }else {
            chooseOption(optionNum);
        }
    }

    public Option chooseOption(int optionNum){
        return optionList.get(optionNum - 1);
    }
}
