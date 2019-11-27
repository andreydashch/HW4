/*
 * @(#) Controller.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber;

import ua.training.subscriber.constants.RegexConst;
import ua.training.subscriber.constants.TextConst;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author      Dashchyk Andrey
 */
public class Controller {
    private View view;
    private AccountCard accountCard;

    Controller(AccountCard accountCard, View view){
        this.accountCard = accountCard;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> accountInfo;

        accountCard.setAccountCard(getUserInfo(sc));
        accountInfo = accountCard.getAccountCard(TextConst.NAME_SEPARATOR,
                TextConst.ADDRESS_SEPARATOR);

        view.printHashMap(accountInfo);
    }

    private HashMap<String, String> getUserInfo(Scanner sc) {
        int index = 0;
        HashMap<String, String> account = new HashMap<>();
        String[] keysArray = AccountCard.getKeysOfMap();
        String[] regexArray = RegexConst.getRegexArray();

        for (String key : keysArray){
            account.put(key, getValidInput(sc, regexArray[index]));
            index++;
        }

        return account;
    }

    private String getValidInput(Scanner sc, String regex) {
        String temp;

        while (true) {
            // view.printMessage(hintMessage);
            temp = sc.next();
            if (temp.matches(regex)) {
                return temp;
            }
        }
    }

    private String generateHintMessage() {
        return "notImplement";
    }
}
