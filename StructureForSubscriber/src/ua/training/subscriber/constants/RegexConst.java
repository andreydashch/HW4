/*
 * @(#) RegexConst.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.constants;

import java.util.Scanner;

/**
 * @author      Dashchyk Andrey
 */
public class RegexConst {
    public static final String FIRST_NAME = ".";
    public static final String SURNAME = ".";
    public static final String PATRONYMIC = ".";
    public static final String NICK_NAME = ".";
    public static final String COMMENT = ".";
    public static final String GROUP = ".";
    public static final String HOME_TELEPHONE = ".";
    public static final String MOBIL_TELEPHONE = ".";
    public static final String EMAIL = ".";
    public static final String SKYPE = ".";
    public static final String INDEX = ".";
    public static final String CITY = ".";
    public static final String STREET = ".";
    public static final String HOUSE_NUMBER = ".";
    public static final String FLAT_NUMBER = ".";

    public static String[] getRegexArray() {

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
