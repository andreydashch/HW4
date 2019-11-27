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

    public Meta() {
    }

    public void setUpdateTime() {
        updateTime = LocalDateTime.now();
        setCreateTime();
    }

    private void setCreateTime() {
        boolean notSet = createTime == LocalDateTime.MIN;
        if (notSet) {
            createTime = updateTime;
        }
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }
}