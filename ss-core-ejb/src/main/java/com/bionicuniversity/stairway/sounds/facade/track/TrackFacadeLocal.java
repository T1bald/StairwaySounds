package com.bionicuniversity.stairway.sounds.facade.track;

import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.GeneralFacadeLocal;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by happy on 17/12/2014.
 */

@Local
public interface TrackFacadeLocal extends GeneralFacadeLocal<Track> {
    List<Track> findPopularTracks();
}
