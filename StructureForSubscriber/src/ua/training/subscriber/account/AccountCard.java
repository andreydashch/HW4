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
    /*
     * After adding field,
     * add them to Const.keys too!!!!
     */
    private Identity identity;
    private Contacts contacts;
    private Meta meta;

    public AccountCard() {
        identity = new Identity();
        contacts = new Contacts();
        meta = new Meta();
    }

    public static String[] getFieldsKeys() {
        return Const.keys;
    }

    public static int getLengthOfKeysMap() {
        return Const.keys.length;
    }

    public static String[] getNotRequiredFieldsKeys(){
        return Const.notRequiredKeys;
    }

    /**
     * Need be update with
     * update of fields list
     *
     * But more understandable
     */
    public void setAccountCard(
                        String firstName,
                        String surname,
                        String patronymic,
                        String nickName,
                        String comment,
                        String group,
                        String homeTelephone,
                        String mobil1Telephone,
                        String mobil2Telephone,
                        String email,
                        String skype,
                        String index,
                        String city,
                        String street,
                        String houseNumber,
                        String flatNumber) {
        String[] data = {
                 firstName,
                 surname,
                 patronymic,
                 nickName,
                 comment,
                 group,
                 homeTelephone,
                 mobil1Telephone,
                 mobil2Telephone,
                 email,
                 skype,
                 index,
                 city,
                 street,
                 houseNumber,
                 flatNumber
        };

        setAccountCard(data);

    }

    public void setAccountCard(String[] data) {
        meta.setUpdateTime();
        identity.name.setFirstName(data[0]);
        identity.name.setSurname(data[1]);
        identity.name.setPatronymic(data[2]);
        identity.setNickName(data[3]);
        identity.setComment(data[4]);
        identity.setGroup(data[5]);
        contacts.telephonesNumbers.setHome(data[6]);
        contacts.telephonesNumbers.setMobil1(data[7]);
        contacts.telephonesNumbers.setMobil2(data[8]);
        contacts.setEmail(data[9]);
        contacts.setSkype(data[10]);
        contacts.address.setIndex(data[11]);
        contacts.address.setCity(data[12]);
        contacts.address.setStreet(data[13]);
        contacts.address.setHouseNumber(data[14]);
        contacts.address.setFlatNumber(data[15]);
    }

    public HashMap<String, String> getFieldsKeys(String nameSeparator, String addressSeparator) {
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