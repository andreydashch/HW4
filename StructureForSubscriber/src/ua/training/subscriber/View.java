/*
 * @(#) View.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber;

import ua.training.subscriber.constants.TextConst;

import java.util.HashMap;

/**
 * @author      Dashchyk Andrey
 */
public class View {

    public void printHashMap(HashMap<String, String> hashMap) {
        for(String key : hashMap.keySet()){
            printMessage(key + TextConst.TEXT_SEPARATOR + hashMap.get(key));
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
