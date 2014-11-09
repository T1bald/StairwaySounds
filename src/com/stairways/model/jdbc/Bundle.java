package com.stairways.model.jdbc;

import java.util.ResourceBundle;

/**
 * Created by matvey on 21.10.14.
 */
public class Bundle {

    private static Bundle instance;
    private ResourceBundle resource;
    private static final String BUNDLE_NAME = "com.stairways.model.jdbc.bundle";
    public static final String INDEX = "INDEX";
    public static final String MAIN = "MAIN";
    public static final String LOGIN = "LOGIN";
    public static final String START = "START";
    public static final String ERROR = "ERROR";


    public static Bundle getInstance() {
        if (instance == null) {
            instance = new Bundle();
            instance.resource = ResourceBundle.getBundle(BUNDLE_NAME);
        }
        return instance;
    }

    public String getProperty(String key) {
        return (String) resource.getObject(key);
    }
}
