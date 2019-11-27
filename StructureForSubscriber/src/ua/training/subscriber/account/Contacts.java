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
    String email;
    String skype;

    public Contacts() {
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