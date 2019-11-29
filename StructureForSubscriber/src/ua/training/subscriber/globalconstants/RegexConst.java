/*
 * @(#) RegexConst.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.globalconstants;

import ua.training.subscriber.account.AccountCard;

import java.util.HashMap;

/**
 * @author      Dashchyk Andrey
 */
public class RegexConst {
    public static final String FIRST_NAME = "[A-Z][a-z]+";
    public static final String SURNAME = "[A-Z][a-z]+";
    public static final String PATRONYMIC = "[A-Z][a-z]+";
    public static final String NICK_NAME = "\\w*";
    public static final String COMMENT = ".{1,1000}";
    public static final String GROUP = ".*";
    public static final String HOME_TELEPHONE = "\\+[\\d]{3,12}";
    public static final String MOBIL_TELEPHONE = "\\+[\\d]{3,12}";
    public static final String EMAIL = ".*@.*?";
    public static final String SKYPE = ".*";
    public static final String INDEX = "[\\d]{3}[1-9]";
    public static final String CITY = "\\w*";
    public static final String STREET = "\\w*";
    public static final String HOUSE_NUMBER = "[\\d]{1,4}[1-9]";
    public static final String FLAT_NUMBER = "[\\d]{1,5}[1-9]";
    public static final HashMap<String, String> REGEX = new HashMap<>();


    public static void initializeREGEX() {
        int index = 0;
        String[] regexArray = getRegexArray();
        String[] keysArray = AccountCard.getFieldsKeys();

        for(String key : keysArray) {
            REGEX.put(key, regexArray[index]);
            index++;
        }
    }

    private static String[] getRegexArray() {

        // sequence is very important
        return new String[]{
                FIRST_NAME,
                SURNAME,
                PATRONYMIC,
                NICK_NAME,
                COMMENT,
                GROUP,
                HOME_TELEPHONE,
                MOBIL_TELEPHONE,
                MOBIL_TELEPHONE,
                EMAIL,
                SKYPE,
                INDEX,
                CITY,
                STREET,
                HOUSE_NUMBER,
                FLAT_NUMBER
        };
    }
}
