/*
 * @(#) Main.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber;

import ua.training.subscriber.account.AccountCard;

/**
 * Storing user information
 *
 * @author      Dashchyk Andrey
 */
public class Main {

    /**
     * @author      Dashchyk Andrey
     */
    public static void main( String[] args ){
        // Initialization
        AccountCard accountCard = new AccountCard();
        View view = new View();
        Controller controller = new Controller(accountCard, view);

        //Run
        controller.processUser();
    }

}