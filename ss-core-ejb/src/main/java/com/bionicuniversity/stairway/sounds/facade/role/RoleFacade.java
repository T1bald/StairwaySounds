package com.bionicuniversity.stairway.sounds.facade.role;

import com.bionicuniversity.stairway.sounds.entity.Role;
import com.bionicuniversity.stairway.sounds.facade.AbstractFacade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by happy on 22/12/2014.
 */
@Stateless
public class RoleFacade extends AbstractFacade<Role> implements RoleFacadeLocal{

    @PersistenceContext(unitName = "SSPUnit")
    private EntityManager entityManager;

    public RoleFacade() {
        super(Role.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
