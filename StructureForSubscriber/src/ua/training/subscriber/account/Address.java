/*
 * @(#) Address.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.account;

/**
 * @author      Dashchyk Andrey
 */
class Address {
    String index;
    String city;
    String street;
    String houseNumber;
    String flatNumber;

    public Address() {
    }

    void setCity(String city) {
        this.city = city;
    }

    void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    void setHouseNumber(String house) {
        this.houseNumber = house;
    }

    void setIndex(String index) {
        this.index = index;
    }

    void setStreet(String street) {
        this.street = street;
    }

    String getAddress(String separator) {
        return  index +
                separator +
                city +
                separator +
                street +
                separator +
                houseNumber +
                separator +
                flatNumber;
    }
}