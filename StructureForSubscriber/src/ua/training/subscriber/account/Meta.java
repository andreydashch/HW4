/*
 * @(#) Meta.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.subscriber.account;

import java.time.LocalDateTime;

/**
 * @author      Dashchyk Andrey
 */
public class Meta {
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    Meta() {
    }

    void setUpdateTime() {
        updateTime = LocalDateTime.now();
        setCreateTime();
    }

    void setCreateTime() {
        boolean notSet = createTime == LocalDateTime.MIN;
        if (notSet) {
            createTime = updateTime;
        }
    }

    LocalDateTime getCreateTime() {
        return createTime;
    }

    LocalDateTime getUpdateTime() {
        return updateTime;
    }
}