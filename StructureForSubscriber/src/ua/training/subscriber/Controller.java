/*
 * @(#) Controller.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber;

import ua.training.subscriber.constants.RegexConst;

import java.util.HashMap;

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
        HashMap<String, String> account;
        account = new HashMap<>();

        account.put("firstName", getValidInput(RegexConst.FIRST_NAME));
    }

    private String getValidInput(String regex) {
        return "notImplemented";
    }

    private String generateHintMessage() {
        return "notImplement";
    }
}
