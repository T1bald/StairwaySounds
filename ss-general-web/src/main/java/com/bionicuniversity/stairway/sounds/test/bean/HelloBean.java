package com.bionicuniversity.stairway.sounds.test.bean;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by root on 10.12.14.
 */

@Named
@SessionScoped
public class HelloBean implements Serializable{

    public HelloBean(){
    }

    private String message = "Hello From Managed Bean!";

    private String inputVar = "";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getInputVar() {
        return inputVar;
    }

    public void setInputVar(String inputVar) {
        this.inputVar = inputVar;
    }
}
