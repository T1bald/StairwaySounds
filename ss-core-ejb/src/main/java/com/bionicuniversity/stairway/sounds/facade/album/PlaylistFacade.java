package com.bionicuniversity.stairway.sounds.facade.album;

import com.bionicuniversity.stairway.sounds.entity.Album;
import com.bionicuniversity.stairway.sounds.entity.Playlist;
import com.bionicuniversity.stairway.sounds.facade.AbstractFacade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by user on 23.12.2014.
 */

@Stateless
public class PlaylistFacade extends AbstractFacade<Playlist> implements PlaylistFacadeLocal {

    @PersistenceContext(unitName = "SSPUnit")
    private EntityManager entityManager;

    public PlaylistFacade() {
        super(Playlist.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Playlist> getAllByUser(Integer id) {
        return getEntityManager().createQuery("select playList from Playlist playList where playList.owner.id = :owner_id", Playlist.class).setParameter("owner_id", id).getResultList();

    }
}
