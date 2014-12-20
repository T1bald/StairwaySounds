package com.bionicuniversity.stairway.sounds.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by happy on 20/12/2014.
 */
public class PropertyHandler {
    private Properties properties = new Properties();

    public PropertyHandler(String fileName) throws IOException {
        InputStream fileStream = Thread.currentThread()
            .getContextClassLoader().getResourceAsStream(fileName);
        properties.load(fileStream);
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }

}
