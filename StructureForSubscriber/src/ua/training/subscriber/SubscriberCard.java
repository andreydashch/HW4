package ua.training.subscriber;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SubscriberCard{
    private Identity identity;
    private Contacts contacts;
    private Meta meta;

    SubscriberCard() {
        identity = new Identity();
        contacts = new Contacts();
        meta = new Meta();
    }

}

class Identity {
    private Map<String, StringBuilder> name;
    private String nickName;
    private String comment;
    private String group;

    Identity() {
        name = new HashMap<String, StringBuilder>();

        name.put("surname", new StringBuilder());
        name.put("firstName", new StringBuilder());
        name.put("patronymic", new StringBuilder());
    }
}

class Contacts {
    private TelephonesNumbers telephonesNumbers;
    private String email;
    private String skype;
    private Map<String, StringBuilder> address;

    Contacts() {
        telephonesNumbers = new TelephonesNumbers();
        address = new HashMap<String, StringBuilder>();

        address.put("index", new StringBuilder());
        address.put("city", new StringBuilder());
        address.put("street", new StringBuilder());
        address.put("houseNumber", new StringBuilder());
        address.put("flatNumber", new StringBuilder());
    }
}

class TelephonesNumbers {
    private String Home;
    private String Mobil1;
    private String Mobil2;
}

class Meta {
    private LocalDateTime timeOfCreate;
    private LocalDateTime timeOfLastUpdate;
}