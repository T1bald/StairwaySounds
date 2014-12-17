package com.bionicuniversity.stairway.sounds.facade.track;

import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.GeneralFacadeLocal;

import java.util.List;

/**
 * Created by happy on 17/12/2014.
 */
public interface TrackFacadeLocal extends GeneralFacadeLocal {
    List<Track> findPopularTracks(int amount);

}
