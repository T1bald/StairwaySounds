package com.stairways.model.DAO;

import java.util.List;

/**
 * Created by matvey on 14.10.14.
 */

public interface MySqlDAO<T> {

    public List<T> findAll();
    public T findById(int id);
    public void insert(T value);
    public void update(T value);

}
