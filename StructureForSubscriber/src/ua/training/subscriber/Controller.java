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
        Scanner sc = new Scanner(System.in):
        HashMap<String, String> accountInfo;

        accountCard.setAccountCard(getUserInfo(sc));
        accountInfo = accountCard.getAccountCard(TextConst.NAME_SEPARATOR,
                TextConst.ADDRESS_SEPARATOR);

        view.printHashMap(accountInfo);
    }

    private HashMap<String, String> getUserInfo(Scanner sc) {
        HashMap<String, String> account;
        account = new HashMap<>();

        account.put("firstName", getValidInput(sc, RegexConst.FIRST_NAME));
        account.put("surname", getValidInput(sc, RegexConst.SURNAME));
        account.put("patronymic", getValidInput(sc, RegexConst.PATRONYMIC));
        account.put("nickName", getValidInput(sc, RegexConst.NICK_NAME));
        account.put("comment", getValidInput(sc, RegexConst.COMMENT));
        account.put("group", getValidInput(sc, RegexConst.GROUP));
        account.put("homeTelephone", getValidInput(sc, RegexConst.HOME_TELEPHONE));
        account.put("mobil1Telephone", getValidInput(sc, RegexConst.MOBIL_TELEPHONE));
        account.put("mobil2Telephone", getValidInput(sc, RegexConst.MOBIL_TELEPHONE));
        account.put("email", getValidInput(sc, RegexConst.EMAIL));
        account.put("skype", getValidInput(sc, RegexConst.SKYPE));
        account.put("index", getValidInput(sc, RegexConst.INDEX));
        account.put("city", getValidInput(sc, RegexConst.CITY));
        account.put("street", getValidInput(sc, RegexConst.STREET));
        account.put("houseNumber", getValidInput(sc, RegexConst.HOUSE_NUMBER));
        account.put("flatNumber", getValidInput(sc, RegexConst.FLAT_NUMBER));

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
