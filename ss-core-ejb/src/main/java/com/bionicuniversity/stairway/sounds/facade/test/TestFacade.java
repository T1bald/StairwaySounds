package com.bionicuniversity.stairway.sounds.facade.test;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by root on 17.12.14.
 */

@Stateless
public class TestFacade implements TestFacadeLocal, Serializable{

    private String message = "test facade message";

    public String message() {
         return "message from Test Facade";
    }

    public void test() {
        System.out.println("-----------------------test is " +
                "running!----------------------");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
