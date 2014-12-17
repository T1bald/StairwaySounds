package com.bionicuniversity.stairway.sounds.bean.view;

import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.test.TestFacade;
import com.bionicuniversity.stairway.sounds.facade.track.TrackFacade;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
* Created by root on 12.12.14.
*/

@Named
public class TestBean implements Serializable{

    @Inject
    private TestFacade testFacade;

    private String message = "Hello from TEST BEAN!";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public TestFacade getTestFacade() {
        return testFacade;
    }

    public void setTestFacade(TestFacade testFacade) {
        this.testFacade = testFacade;
    }
}
