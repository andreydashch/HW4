/*
 * @(#) AccountCard.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.account;

import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author      Dashchyk Andrey
 */
public class AccountCard {
    private Identity identity;
    private Contacts contacts;
    private Meta meta;

    public AccountCard() {
        identity = new Identity();
        contacts = new Contacts();
        meta = new Meta();
    }

    public static String[] getKeysOfMap() {
        return Const.keys;
    }

    public static String[] getNotRequiredKeysOfMap(){
        return Const.notRequiredKeys;
    }

    public void setAccountCard(HashMap<String, String> account) {
        meta.setUpdateTime();
        identity.name.setFirstName(account.get("firstName"));
        identity.name.setSurname(account.get("surname"));
        identity.name.setPatronymic(account.get("patronymic"));
        identity.setNickName(account.get("nickName"));
        identity.setComment(account.get("comment"));
        identity.setGroup(account.get("group"));
        contacts.telephonesNumbers.setHome(account.get("homeTelephone"));
        contacts.telephonesNumbers.setMobil1(account.get("mobil1Telephone"));
        contacts.telephonesNumbers.setMobil2(account.get("mobil2Telephone"));
        contacts.setEmail(account.get("email"));
        contacts.setSkype(account.get("skype"));
        contacts.address.setIndex(account.get("index"));
        contacts.address.setCity(account.get("city"));
        contacts.address.setStreet(account.get("street"));
        contacts.address.setHouseNumber(account.get("houseNumber"));
        contacts.address.setFlatNumber(account.get("flatNumber"));
    }

    public HashMap<String, String> getAccountCard(String nameSeparator, String addressSeparator) {
        HashMap<String, String> account;

        account = new HashMap<>();
        account.put("fullName", identity.name.getFullName(nameSeparator));
        account.put("nickName", identity.getNickName());
        account.put("comment", identity.getComment());
        account.put("group", identity.getGroup());
        account.put("homeTelephone", contacts.telephonesNumbers.getHome());
        account.put("mobil1Telephone", contacts.telephonesNumbers.getMobil1());
        account.put("mobil2Telephone", contacts.telephonesNumbers.getMobil2());
        account.put("email", contacts.getEmail());
        account.put("skype", contacts.getSkype());
        account.put("address", contacts.address.getAddress(addressSeparator));

        return account;
    }

    public LocalDateTime getCreateTime(){
        return meta.getCreateTime();
    }

    public LocalDateTime getUpdateTime(){
        return meta.getUpdateTime();
    }

}