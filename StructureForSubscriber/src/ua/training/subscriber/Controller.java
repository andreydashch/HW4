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
        HashMap<String, String> accountInfo;
        accountCard.setAccountCard(getUserInfo());
        accountInfo = accountCard.getAccountCard(TextConst.NAME_SEPARATOR,
                TextConst.ADDRESS_SEPARATOR);

        view.printHashMap(accountInfo);
    }

    private HashMap<String, String> getUserInfo() {
        HashMap<String, String> account;
        account = new HashMap<>();

        account.put("firstName", getValidInput(RegexConst.FIRST_NAME));
        account.put("surname", getValidInput(RegexConst.SURNAME));
        account.put("patronymic", getValidInput(RegexConst.PATRONYMIC));
        account.put("nickName", getValidInput(RegexConst.NICK_NAME));
        account.put("comment", getValidInput(RegexConst.COMMENT));
        account.put("group", getValidInput(RegexConst.GROUP));
        account.put("homeTelephone", getValidInput(RegexConst.HOME_TELEPHONE));
        account.put("mobil1Telephone", getValidInput(RegexConst.MOBIL_TELEPHONE));
        account.put("mobil2Telephone", getValidInput(RegexConst.MOBIL_TELEPHONE));
        account.put("email", getValidInput(RegexConst.EMAIL));
        account.put("skype", getValidInput(RegexConst.SKYPE));
        account.put("index", getValidInput(RegexConst.INDEX));
        account.put("city", getValidInput(RegexConst.CITY));
        account.put("street", getValidInput(RegexConst.STREET));
        account.put("houseNumber", getValidInput(RegexConst.HOUSE_NUMBER));
        account.put("flatNumber", getValidInput(RegexConst.FLAT_NUMBER));

        return account;
    }

    private String getValidInput(String regex) {
        return "notImplemented";
    }

    private String generateHintMessage() {
        return "notImplement";
    }
}
