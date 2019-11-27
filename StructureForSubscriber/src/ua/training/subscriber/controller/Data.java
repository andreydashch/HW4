/*
 * @(#) Controller.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.controller;

import ua.training.subscriber.view.View;
import ua.training.subscriber.account.AccountCard;
import ua.training.subscriber.globalconstants.RegexConst;
import ua.training.subscriber.globalconstants.TextConst;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author      Dashchyk Andrey
 */
class Data {
    private View view;

    Data(View view) {
        this.view = view;
    }

    void printAccountCard(HashMap<String, String> accountInfo){
        TreeSet<String> sortKeys = new TreeSet<String>(accountInfo.keySet());

        for(String key : sortKeys){
            view.printMessage(key + TextConst.TEXT_SEPARATOR + accountInfo.get(key));
        }
    }

    HashMap<String, String> getUserInfo(Scanner sc) {
        int index = 0;
        String validInput;
        HashMap<String, String> account = new HashMap<>();
        String[] keysArray = AccountCard.getKeysOfMap();
        String[] regexArray = RegexConst.getRegexArray();

        for (String key : keysArray){
            validInput = getValidInput(sc, regexArray[index], key);
            account.put(key, validInput);
            index++;
        }

        return account;
    }

    private String getValidInput(Scanner sc, String regex, String key) {
        String temp;

        while (true) {
            regex = checkRequirements(regex, key);
            view.printMessage(genHintMessage(key));
            temp = sc.next();

            if (temp.matches(regex)) {
                return temp;
            }
        }
    }

    private String checkRequirements(String regex, String key) {
        for(String elem : AccountCard.getNotRequiredKeysOfMap()){
            boolean notRequire = elem.equals(key);

            if(notRequire){
                view.printMessage(TextConst.SKIP_HINT);
                regex = "(" + regex + ")|(-)";
            }
        }

        return regex;
    }

    private String genHintMessage(String key) {
        StringBuilder hintMessage;
        hintMessage = new StringBuilder();
        hintMessage.append(TextConst.START_HINT);
        hintMessage.append(key);

        return hintMessage.toString();
    }
}
