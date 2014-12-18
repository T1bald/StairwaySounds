package com.bionicuniversity.stairway.sounds.facade.test;

import javax.ejb.Stateless;
import javax.el.StaticFieldELResolver;
import java.io.Serializable;

/**
 * Created by root on 17.12.14.
 */

@Stateless
public class TestFacade implements TestFacadeLocal, Serializable{


    public String message = "test facade message";

    public String getSecondMessage() {
        return secondMessage;
    }

    public void setSecondMessage(String secondMessage) {
        this.secondMessage = secondMessage;
    }

    public String secondMessage = "second message test" ;

    public TestFacade(){

    }

    public void  test(){

        setSecondMessage("Hello from a second message");

        System.out.println( "-----------------------test is " +
                "running!----------------------");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
