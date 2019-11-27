package ua.training.subscriber;

import java.time.LocalDateTime;
import java.util.HashMap;

public class AccountCard {
    private Identity identity;
    private Contacts contacts;
    private Meta meta;

    AccountCard() {
        identity = new Identity();
        contacts = new Contacts();
        meta = new Meta();
    }

    public void setAccountCard(HashMap<String, String> account) {
        meta.setTimeUpdate();
        identity.name.setFirstName(account.get("firstName"));
        identity.name.setSurname(account.get("surname"));
        identity.name.setPatronymic(account.get("patronymic"));
        identity.setNickName(account.get("nickName"));
        identity.setComment(account.get("comment"));
        identity.setGroup(account.get("group"));
        contacts.telephonesNumbers.setHome(account.get("homeTelephone"));
        contacts.telephonesNumbers.setMobil1(account.get("mobil1telephone"));
        contacts.telephonesNumbers.setMobil2(account.get("mobil2telephone"));
        contacts.setEmail(account.get("email"));
        contacts.setSkype(account.get("skype"));
        contacts.address.setIndex(account.get("index"));
        contacts.address.setCity(account.get("city"));
        contacts.address.setStreet(account.get("street"));
        contacts.address.setHouseNumber(account.get("houseNumber"));
        contacts.address.setFlatNumber(account.get("flatNumber"));
    }

    public void getAccountCard(String nameSeparator, String addressSeparator) {
        HashMap<String, String> account;

        account = new HashMap<>();
        account.put("fullName", identity.name.getFullName(nameSeparator));
        account.put("nickName", identity.getNickName());
        account.put("comment", identity.getComment());
        account.put("group", identity.getGroup());
        account.put("homeTelephone", contacts.telephonesNumbers.getHome());
        account.put("mobile1Telephone", contacts.telephonesNumbers.getMobil1());
        account.put("mobile2Telephone", contacts.telephonesNumbers.getMobil2());
        account.put("email", contacts.getEmail());
        account.put("skype", contacts.getSkype());
        account.put("address", contacts.address.getAddress(addressSeparator));
    }

    public LocalDateTime getCreateTime(){
        return meta.getCreateTime();
    }

    public LocalDateTime getUpdateTime(){
        return meta.getUpdateTime();
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

    public String getComment() {
        return comment;
    }

    public String getGroup() {
        return group;
    }

    public String getNickName() {
        return nickName;
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

    public String getFullName(String separator) {
        StringBuilder fullName = new StringBuilder(50);

        fullName.append(surname);
        fullName.append(separator);
        fullName.append(firstName);
        fullName.append(separator);
        fullName.append(patronymic);

        return fullName.toString();
    }
}

class Contacts {
    public TelephonesNumbers telephonesNumbers;
    public Address address;
    private String email;
    private String skype;

    Contacts() {
        telephonesNumbers = new TelephonesNumbers();
        address = new Address();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }
}

class Address {
    String index;
    String city;
    String street;
    String houseNumber;
    String flatNumber;

    public void setCity(String city) {
        this.city = city;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setHouseNumber(String house) {
        this.houseNumber = house;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress(String separator) {
        StringBuilder address = new StringBuilder(100);

        address.append(index);
        address.append(separator);
        address.append(city);
        address.append(separator);
        address.append(street);
        address.append(separator);
        address.append(houseNumber);
        address.append(separator);
        address.append(flatNumber);

        return address.toString();
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
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    Meta() {
        createTime = LocalDateTime.MIN;
    }

    public void setTimeUpdate() {
            updateTime = LocalDateTime.now();
            setCreateTime();
    }

    private void setCreateTime() {
        boolean notSet = createTime == LocalDateTime.MIN;
        if (notSet) {
            createTime = updateTime;
        }
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }
}