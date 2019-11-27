/*
 * @(#) Identity.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.account;

/**
 * @author      Dashchyk Andrey
 */
class Identity {
    public Name name;
    private String nickName;
    private String comment;
    private String group;

    Identity() {
        name = new Name();
    }

    void setComment(String comment) {
        this.comment = comment;
    }

    void setGroup(String group) {
        this.group = group;
    }

    void setNickName(String nickName) {
        this.nickName = nickName;
    }

    String getComment() {
        return comment;
    }

    String getGroup() {
        return group;
    }

    public String getNickName() {
        return nickName;
    }
}