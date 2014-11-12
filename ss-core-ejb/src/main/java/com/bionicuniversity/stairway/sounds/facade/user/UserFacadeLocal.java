package com.bionicuniversity.stairway.sounds.facade.user;

import com.bionicuniversity.stairway.sounds.entity.User;

import javax.ejb.Local;

/**
 * Created by happy on 11/11/2014.
 */

@Local
public interface UserFacadeLocal {
    User findById(int id);
    void save(User user);
}
