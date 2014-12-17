package com.bionicuniversity.stairway.sounds.facade.track;

import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.AbstractFacade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by happy on 17/12/2014.
 */
public class TrackFacade extends AbstractFacade implements TrackFacadeLocal{

    @PersistenceContext(unitName = "SSPUnit")
    private EntityManager entityManager;

    public TrackFacade() {
        super(Track.class);
    }



    @Override
    protected EntityManager getEntityManager() {
        return null;
    }

    @Override
    public List<Track> findPopularTracks(int amount) {
        return null;
    }

    @Override
    public Object insert(Object entity) {
        return null;
    }

    @Override
    public Object insertOrUpdate(Object entity) {
        return null;
    }

    @Override
    public Object markAsDeleted(Object entity) {
        return null;
    }

    @Override
    public Object remove(Object entity) {
        return null;
    }
}
