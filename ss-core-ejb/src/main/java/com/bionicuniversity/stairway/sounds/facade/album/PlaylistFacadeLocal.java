package com.bionicuniversity.stairway.sounds.facade.album;

import com.bionicuniversity.stairway.sounds.entity.Album;
import com.bionicuniversity.stairway.sounds.entity.Playlist;
import com.bionicuniversity.stairway.sounds.facade.GeneralFacadeLocal;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by user on 23.12.2014.
 */
@Local
public interface PlaylistFacadeLocal extends GeneralFacadeLocal<Playlist> {
    List<Playlist> getAllByUser(Integer id);
}
