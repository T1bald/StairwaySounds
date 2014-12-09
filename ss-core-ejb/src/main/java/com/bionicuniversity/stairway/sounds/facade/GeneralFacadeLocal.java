package com.bionicuniversity.stairway.sounds.facade;

/**
 * Created by happy on 14/11/2014.
 */
public interface GeneralFacadeLocal<T> {
    T insert(T entity);
    T insertOrUpdate(T entity);
    T findById(Object id);
    T markAsDeleted(T entity);
    T remove(T entity);
}
