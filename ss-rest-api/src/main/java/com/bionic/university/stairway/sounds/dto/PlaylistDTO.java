package com.bionic.university.stairway.sounds.dto;

import com.bionicuniversity.stairway.sounds.entity.Track;

import java.util.List;

/**
 * Created by happy on 19/12/2014.
 */
public class PlaylistDTO {
    private List<Track> trackList;

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }
}
