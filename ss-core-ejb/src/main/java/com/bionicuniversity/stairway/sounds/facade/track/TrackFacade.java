package com.bionicuniversity.stairway.sounds.facade.track;

import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.AbstractFacade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by happy on 17/12/2014.
 */

@Stateless
public class TrackFacade extends AbstractFacade<Track> implements TrackFacadeLocal{

    @PersistenceContext(unitName = "SSPUnit")
    private EntityManager entityManager;

    public TrackFacade() {
        super(Track.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Track> findPopularTracks() {
//        TypedQuery<Track> query = entityManager.createNamedQuery("findPopularTracks", Track.class);

        TypedQuery<Track> query = entityManager.createNamedQuery("findTracksByAmount", Track.class);

        List<Track> trackList = query.getResultList();
        for (int i = 0; i < trackList.size(); i++) {
            System.out.println(trackList.get(i).toString());
        }
        return trackList;
    }
}
