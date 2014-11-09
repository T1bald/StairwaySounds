//package com.stairways.model.DAO;
//
//import com.stairways.model.Entity.TracksEntity;
//
//import javax.persistence.*;
//import java.util.List;
//
///**
// * Created by matvey on 04.11.14.
// */
//public class JPATracksDAOImpl implements MySqlDAO<TracksEntity> {
//
//        EntityManagerFactory entityManagerFactory = Persistence
//                .createEntityManagerFactory("eclipsePersistenceUnit");
//    @Override
//    public List<TracksEntity> findAll() {
//        List<TracksEntity> tracks = null;
//
//        EntityManager em = entityManagerFactory.createEntityManager();
//        EntityTransaction tr = em.getTransaction();
//        tr.begin();
//        Query query = em.createQuery("SELECT t From TracksEntity t");
//        tracks = query.getResultList();
//        return tracks;
//    }
//
//    @Override
//    public TracksEntity findById(int id) {
//        return null;
//    }
//
//    @Override
//    public void insert(TracksEntity value) {
//
//    }
//
//    @Override
//    public void update(TracksEntity value) {
//
//    }
//}
