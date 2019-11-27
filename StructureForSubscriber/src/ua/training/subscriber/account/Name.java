/*
 * @(#) Name.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.account;

/**
 * @author      Dashchyk Andrey
 */
class Name {
    String surname;
    String firstName;
    String patronymic;

    Name() {
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getFullName(String separator) {
        return  surname +
                separator +
                firstName +
                separator +
                patronymic;
    }
}