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

    public Name() {
    }

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
        return  surname +
                separator +
                firstName +
                separator +
                patronymic;
    }
}