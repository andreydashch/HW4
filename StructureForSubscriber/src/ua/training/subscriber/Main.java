/*
 * @(#) Main.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber;

import ua.training.subscriber.account.AccountCard;
import ua.training.subscriber.controller.Controller;
import ua.training.subscriber.globalconstants.RegexConst;
import ua.training.subscriber.view.View;

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
        RegexConst.setREGEX();
        AccountCard accountCard = new AccountCard();
        View view = new View();

        Controller controller = new Controller(accountCard, view);

        //Run
        controller.processUser();
    }


}