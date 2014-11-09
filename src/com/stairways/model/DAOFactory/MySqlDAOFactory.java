package com.stairways.model.DAOFactory;

import com.stairways.model.DAO.JPATracksDAOImpl;
import com.stairways.model.DAO.TracksDAOImpl;
import com.stairways.model.DAO.UserDAOImpl;
import com.stairways.model.jdbc.MySqlDataSourceConnector;

import java.sql.Connection;

/**
 * Created by matvey on 26.10.14.
 */
public class MySqlDAOFactory extends DAOFactory{

public static Connection createConnection() {
    Connection connection = MySqlDataSourceConnector.getConnection();
    return connection;
}

    @Override
    public UserDAOImpl getUserDAO() {
    return new UserDAOImpl();
}

    @Override
    public TracksDAOImpl getTracksDAO() {
        return new TracksDAOImpl();
    }

    @Override
    public JPATracksDAOImpl getJPATracksDAO() {
        return new JPATracksDAOImpl();
    }
}
