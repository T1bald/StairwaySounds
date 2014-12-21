package com.bionicuniversity.stairway.sounds.facade.user;

import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.GeneralFacadeLocal;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by happy on 11/11/2014.
 */

@Local
public interface UserFacadeLocal extends GeneralFacadeLocal<User> {

    List<User> findAll();

    User findByEmail(String email);

    User findByToken(String token);

    @Override
    User insert(User entity);

    @Override
    User insertOrUpdate(User entity);

    @Override
    User findById(Object id);

    @Override
    User markAsDeleted(User entity);

    @Override
    User remove(User entity);


}

