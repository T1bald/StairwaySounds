package com.bionicuniversity.stairway.sounds.util;

/**
 * Created by happy on 20/12/2014.
 */
public enum PropertyFile {
    CONTENT("content.properties");

    private String fileName;

    PropertyFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
