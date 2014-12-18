package com.bionicuniversity.stairway.sounds.test.bean;

import com.bionicuniversity.stairway.sounds.facade.test.TestFacade;
import com.bionicuniversity.stairway.sounds.facade.test.TestFacadeLocal;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
* Created by root on 12.12.14.
*/

@ManagedBean
@RequestScoped
public class TestBean implements Serializable{

    public TestBean(){
    }

    public String message = "Hello from TEST BEAN!";

    public String facadeMessage = "";

    @EJB
    public TestFacadeLocal testFacade;

    public String buttonEJB() {
        return testFacade.getMessage();
    }

    public void changeMessage(String text){
        message = text;
    }

    public void getFacadeInfo(){
        facadeMessage = testFacade.getMessage();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public TestFacadeLocal getTestFacade() {
        return testFacade;
    }

    public void setTestFacade(TestFacade testFacade) {
        this.testFacade = testFacade;
    }

    public String getFacadeMessage() {
        return facadeMessage;
    }

    public void setFacadeMessage(String facadeMessage) {
        this.facadeMessage = facadeMessage;
    }
}
