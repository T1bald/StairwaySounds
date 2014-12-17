package com.bionicuniversity.stairway.sounds.bean.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by root on 10.12.14.
 */

@Named
@RequestScoped
public class HelloBean implements Serializable{

    private String message = "Hello From Managed Bean!";

    private String name;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
