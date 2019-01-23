package com.swathisprasad.springboot.model;

/**
 * Created by izouari on 23/01/2019.
 */
public class Context {

    private String id;
    private String value;

    public Context(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
