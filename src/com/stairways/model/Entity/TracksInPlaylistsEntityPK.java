package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 28.10.14.
 */
public class TracksInPlaylistsEntityPK implements Serializable {
    private int playlistId;
    private int trackId;

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TracksInPlaylistsEntityPK that = (TracksInPlaylistsEntityPK) o;

        if (playlistId != that.playlistId) return false;
        if (trackId != that.trackId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = playlistId;
        result = 31 * result + trackId;
        return result;
    }
}
