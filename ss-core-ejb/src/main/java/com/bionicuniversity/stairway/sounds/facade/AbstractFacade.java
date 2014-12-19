package com.bionicuniversity.stairway.sounds.facade;

import com.bionicuniversity.stairway.sounds.entity.AbstractEntity;

import javax.persistence.EntityManager;

/**
 * Created by happy on 13/11/2014.
 */
public abstract class AbstractFacade<T extends AbstractEntity> {
    private Class<T> classType;

    public AbstractFacade(Class<T> classType) {
        this.classType = classType;
    }

    protected abstract EntityManager getEntityManager();

    /*TODO discuss insert and insertOrUpdate methods return values. Should it
     *be entity type or boolean ?
     */

    public T insert(T entity) {
        getEntityManager().persist(entity);
        return entity;
    }

    public T insertOrUpdate(T entity) {
        getEntityManager().merge(entity);
        return entity;
    }

    public T findById(Object id) {
        System.out.println
                ("-------------------AbstractFacade-----------------");
        return getEntityManager().find(classType, id);
    }

    public T markAsDeleted(T entity) {
        entity.setWasDeleted(true);
        getEntityManager().merge(entity);
        return entity;
    }

    public T remove(T entity) {
        getEntityManager().remove(entity);
        return entity;
    }

}
