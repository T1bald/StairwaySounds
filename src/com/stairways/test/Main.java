package com.stairways.test;

import com.stairways.model.DAO.MySqlDAO;
import com.stairways.model.DAOFactory.DAOFactory;
import com.stairways.model.DAOFactory.MySqlDAOFactory;
import com.stairways.model.Entity.TracksEntity;
import com.stairways.model.Entity.User;
import com.stairways.model.jdbc.Connector;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Connector connector =
//                new Connector(Connector.DEFAULT_DRIVER, "root", "root",
//                        "jdbc:mysql://localhost:3306/stairway_sounds");
//
//        MySqlDAOFactory mySqlDAOFactory = (MySqlDAOFactory) MySqlDAOFactory
//                .getDAOFactory(DAOFactory.MYSQL);
//
//        MySqlDAO<User> userDao = mySqlDAOFactory.getUserDAO();
//        List<User> users = userDao.findAll();
//
//        MySqlDAO<TracksEntity> trackDAO = mySqlDAOFactory.getTracksDAO();
//        List<TracksEntity> tracks = trackDAO.findAll();

//        MySqlDAO<TracksEntity> JPAtrackDAO = mySqlDAOFactory.getJPATracksDAO();
//        List<TracksEntity> jpaTracks = JPAtrackDAO.findAll();

        EntityManagerFactory emf =
               Persistence.createEntityManagerFactory("eclipsePersistenceUnit");



//        try {
//            for (TracksEntity tracksEntity: jpaTracks) {
//                System.out.println(tracksEntity.toString());
//            }

//            for (TracksEntity track: tracks) {
//                System.out.println(track);
//            }

//            while (resultSet.h()) {
//                System.out.println("id_user: " + resultSet.getInt("id_user") +
//                        " email: " + resultSet.getString("email") + " name: "
//                + resultSet.getString("username"));
//            }

//        } catch (Exception ex) {
//            System.out.print(ex.getMessage());
//        }
        }

}
