package com.bionicuniversity.stairway.sounds.facade.track;

import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.AbstractFacade;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
* Created by root on 12.12.14.
*/

@Stateless
public class TrackFacade extends AbstractFacade<Track> implements
        TrackFacadeLocal , Serializable{

//    Class<Track> classType;

    public TrackFacade() {
        super(Track.class);
    }

    @Override
    protected EntityManager getEntityManager() {
//        @PersistenceContext(unitName = "SSPUnit")
        EntityManagerFactory emf = Persistence.createEntityManagerFactory
                ("SSPUnit");
        EntityManager em = emf.createEntityManager();

        return em;
    }

    @Override
    public Track remove(Track entity) {
        return super.remove(entity);
    }

    @Override
    public Track markAsDeleted(Track entity) {
        return super.markAsDeleted(entity);
    }

    @Override
    public Track findById(Object id) {
        return super.findById(id);
    }

    @Override
    public Track insertOrUpdate(Track entity) {
        return super.insertOrUpdate(entity);
    }

    @Override
    public Track insert(Track entity) {
        return super.insert(entity);
    }

    public List<Track> findAll() {
        Track track = new Track();
        Query query = getEntityManager().createNamedQuery("findAll");
        return query.getResultList();
    }
}
