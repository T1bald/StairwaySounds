package com.bionicuniversity.stairway.sounds.util;

/**
 * Created by happy on 20/12/2014.
 */
public enum ContentProperty {
    MUSIC("music"),
    PICTURE("picture");

    private String property;

    ContentProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
}
