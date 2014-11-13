package com.bionicuniversity.stairway.sounds.facade.user;

import com.bionicuniversity.stairway.sounds.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by happy on 11/11/2014.
 */

@Stateless
public class UserFacade implements UserFacadeLocal{

    @PersistenceContext(unitName = "SSPUnit")
    private EntityManager entityManager;

    @Override
    public User findById(Integer id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }
}
