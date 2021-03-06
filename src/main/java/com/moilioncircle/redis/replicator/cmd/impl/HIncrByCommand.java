package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * Created by leon on 2/2/17.
 */
public class HIncrByCommand implements Command {
    private String key;
    private String field;
    private long increment;

    public HIncrByCommand() {
    }

    public HIncrByCommand(String key, String field, long increment) {
        this.key = key;
        this.field = field;
        this.increment = increment;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public long getIncrement() {
        return increment;
    }

    public void setIncrement(long increment) {
        this.increment = increment;
    }

    @Override
    public String toString() {
        return "HIncrByCommand{" +
                "key='" + key + '\'' +
                ", field='" + field + '\'' +
                ", increment='" + increment + '\'' +
                '}';
    }
}
