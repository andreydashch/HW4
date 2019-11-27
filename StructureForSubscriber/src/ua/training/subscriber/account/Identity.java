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
    Name name;
    String nickName;
    String comment;
    String group;

    public Identity() {
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public String getGroup() {
        return group;
    }

    public String getNickName() {
        return nickName;
    }
}