package com.stairways.model.DAOFactory;

import com.stairways.model.DAO.JPATracksDAOImpl;
import com.stairways.model.DAO.TracksDAOImpl;
import com.stairways.model.DAO.UserDAOImpl;

/**
 * Created by matvey on 31.10.14.
 */
public class OracleDAOFactory extends DAOFactory {
    @Override
    public UserDAOImpl getUserDAO() {
        return null;
    }

    @Override
    public TracksDAOImpl getTracksDAO() {
        return null;
    }

    @Override
    public JPATracksDAOImpl getJPATracksDAO() {
        return null;
    }
}
