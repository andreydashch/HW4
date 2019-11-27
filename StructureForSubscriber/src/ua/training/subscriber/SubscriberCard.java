package ua.training.subscriber;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SubscriberCard{
    private Identity identity;
    private Contacts contacts;
    private Meta meta;

    SubscriberCard() {
        identity = new Identity();
        contacts = new Contacts();
        meta = new Meta();
    }


}

class Identity {
    public Name name;
    private String nickName;
    private String comment;
    private String group;

    Identity() {
        name = new Name();
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}

class Name {
    String surname;
    String firstName;
    String patronymic;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
class Contacts {
    public TelephonesNumbers telephonesNumbers;
    private String email;
    private String skype;
    private Map<String, String> address;

    Contacts() {
        telephonesNumbers = new TelephonesNumbers();
        address = new HashMap<String, String>();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAddressIndex(String index) {
        this.address.put("index", index);
    }

    public void setAddressCity(String city) {
        this.address.put("city", city);
    }

    public void setAddressStreet(String street) {
        this.address.put("street", street);
    }

    public void setAddressHouse(String house) {
        this.address.put("house", house);
    }
    public void setAddressFlatNumber(String flatNumber) {
        this.address.put("flatNumber", flatNumber);
    }
}

class TelephonesNumbers {
    private String Home;
    private String Mobil1;
    private String Mobil2;

    public void setHome(String home) {
        Home = home;
    }

    public void setMobil1(String mobil1) {
        Mobil1 = mobil1;
    }

    public void setMobil2(String mobil2) {
        Mobil2 = mobil2;
    }

    public String getHome() {
        return Home;
    }

    public String getMobil1() {
        return Mobil1;
    }

    public String getMobil2() {
        return Mobil2;
    }
}

class Meta {
    private LocalDateTime timeOfCreate;
    private LocalDateTime timeOfLastUpdate;

    Meta() {
        timeOfCreate = LocalDateTime.now();
    }

    private void setTimeOfLastUpdate() {
            timeOfLastUpdate = LocalDateTime.now();
    }

    public LocalDateTime getTimeOfCreate() {
        return timeOfCreate;
    }

    public LocalDateTime getTimeOfLastUpdate() {
        return timeOfLastUpdate;
    }
}