package com.bionicuniversity.stairway.sounds.facade.user;

import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.AbstractFacade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by happy on 11/11/2014.
 *
 */

@Stateless
public class UserFacade extends AbstractFacade<User> implements UserFacadeLocal{

    @PersistenceContext(unitName = "SSPUnit")
    private EntityManager entityManager;

    public UserFacade() {
        super(User.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public User findById(Object id) {
        EntityManager em = getEntityManager();
        return em.find(User.class, id);
    }

    public User findByEmail(String email){
        User user = null;
        try {

            user = (User) entityManager.createNamedQuery("findUserByEmail")
                    .setParameter("em", email).getResultList().get(0);

        } catch (ArrayIndexOutOfBoundsException outofbounds){
            outofbounds.printStackTrace();
            return null;
        }
            return user;

        }

    public List<User> findAll(){
        List<User> usersList = entityManager.createNamedQuery
                ("findAllUsers").getResultList();
        return usersList;
    }

}