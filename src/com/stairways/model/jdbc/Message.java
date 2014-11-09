package com.stairways.model.jdbc;

import java.util.ResourceBundle;

/**
 * Created by matvey on 21.10.14.
 */
public class Message {
    private static Message instance;
    private ResourceBundle resource;
    private static final String BUNDLE_NAME = "com.stairways.model.jdbc.messages";
    public static final String SERVLET_EXECPTION = "SERVLET_EXCEPTION";
    public static final String IO_EXCEPTION = "IO_EXCEPTION";
    public static final String LOGIN_ERROR = "LOGIN_ERROR";

    public static Message getInstance() {
        if (instance == null) {
            instance = new Message();
            instance.resource = ResourceBundle.getBundle(BUNDLE_NAME);
        }
        return instance;
    }

    public String getProperty(String key) {
        return (String) resource.getObject(key);
    }
}
