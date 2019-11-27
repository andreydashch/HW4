/*
 * @(#) Contacts.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.account;

/**
 * @author      Dashchyk Andrey
 */
class Contacts {
    TelephonesNumbers telephonesNumbers;
    Address address;
    private String email;
    private String skype;

    Contacts() {
        address = new Address();
        telephonesNumbers = new TelephonesNumbers();
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setSkype(String skype) {
        this.skype = skype;
    }

    String getEmail() {
        return email;
    }

    String getSkype() {
        return skype;
    }
}