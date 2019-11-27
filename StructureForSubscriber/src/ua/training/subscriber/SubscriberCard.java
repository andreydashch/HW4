package ua.training.subscriber;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SubscriberCard{
    private Map<String, StringBuilder> name;
    private String nickName;
    private String comment;
    private String group;

    private String telephoneHome;
    private String telephoneMobil1;
    private String telephoneMobil2;

    private String email;
    private String skype;
    private Map<String, StringBuilder> address;

    private LocalDateTime timeOfCreate;
    private LocalDateTime timeOfLastUpdate;

    SubscriberCard(){
        name = new HashMap<String, StringBuilder>();
        address = new HashMap<String, StringBuilder>();

        name.put("surname", new StringBuilder());
        name.put("firstName", new StringBuilder());
        name.put("patronymic", new StringBuilder());

        address.put("index", new StringBuilder());
        address.put("city", new StringBuilder());
        address.put("street", new StringBuilder());
        address.put("houseNumber", new StringBuilder());
        address.put("flatNumber", new StringBuilder());
    }

}
