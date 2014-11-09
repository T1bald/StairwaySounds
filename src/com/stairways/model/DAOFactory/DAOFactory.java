package com.stairways.model.DAOFactory;

import com.stairways.model.DAO.JPATracksDAOImpl;
import com.stairways.model.DAO.TracksDAOImpl;
import com.stairways.model.DAO.UserDAOImpl;

/**
 * Created by matvey on 26.10.14.
 */
public abstract class DAOFactory {

    public static final int MYSQL = 1;
    public static final int ORACLE= 2;
    public static final int SYBASE= 3;



    /*abstract getDAO methods*/
    public abstract UserDAOImpl getUserDAO();
    public abstract TracksDAOImpl getTracksDAO();
    public abstract JPATracksDAOImpl getJPATracksDAO();

    /* method returns DAOFactory depends on Database*/
    public static DAOFactory getDAOFactory(int RDBMS) {
        switch (RDBMS) {
            case MYSQL :
                return new MySqlDAOFactory();
            case ORACLE:
                return new OracleDAOFactory();
            case SYBASE:
                return new SybaseDAOFactory();
            default :
                return null;

        }
    }

}
