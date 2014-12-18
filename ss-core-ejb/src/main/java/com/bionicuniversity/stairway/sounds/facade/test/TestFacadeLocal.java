package com.bionicuniversity.stairway.sounds.facade.test;

import javax.ejb.Local;

/**
 * Created by root on 17.12.14.
 */

@Local
public interface TestFacadeLocal {

    public void  test();

    public void setMessage(String message);

    public String getMessage();

    public void setSecondMessage(String secondMessage);

}