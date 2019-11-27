/*
 * @(#) TelephonesNumbers.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.account;

/**
 * @author      Dashchyk Andrey
 */
class TelephonesNumbers {
    String home;
    String mobil1;
    String mobil2;

    public TelephonesNumbers() {
    }

    void setHome(String home) {
        this.home = home;
    }

    void setMobil1(String mobil1) {
        this.mobil1 = mobil1;
    }

    void setMobil2(String mobil2) {
        this.mobil2 = mobil2;
    }

    String getHome() {
        return home;
    }

    String getMobil1() {
        return mobil1;
    }

    String getMobil2() {
        return mobil2;
    }
}