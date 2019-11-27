/*
 * @(#) Const.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.account;

/**
 * @author      Dashchyk Andrey
 */
public class Const {// sequence is very important
    static final String[] keys = {
            "firstName",
            "surname",
            "patronymic",
            "nickName",
            "comment",
            "group",
            "homeTelephone",
            "mobil1Telephone",
            "mobil2Telephone",
            "email",
            "skype",
            "index",
            "city",
            "street",
            "houseNumber",
            "flatNumber"
    };

    static final String[] notRequiredKeys = {
            "mobil1Telephone",
    };

}