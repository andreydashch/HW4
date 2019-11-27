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
import ua.training.subscriber.globalconstants.TextConst;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author      Dashchyk Andrey
 */
public class Controller {
    private Data data;
    private AccountCard accountCard;

    public Controller(AccountCard accountCard, View view){
        this.accountCard = accountCard;
        data = new Data(view);
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> accountInfo;

        accountCard.setAccountCard(data.getUserInfo(sc));
        accountInfo = accountCard.getAccountCard(TextConst.NAME_SEPARATOR,
                TextConst.ADDRESS_SEPARATOR);

        data.printAccountCard(accountInfo);
    }


}
