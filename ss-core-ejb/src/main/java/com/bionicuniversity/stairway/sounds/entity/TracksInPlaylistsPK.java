package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by happy on 09/11/2014.
 */
public class TracksInPlaylistsPK implements Serializable {
    private Integer playlistId;
    private Integer trackId;

    @Column(name = "playlist_id")
    @Id
    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    @Column(name = "track_id")
    @Id
    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TracksInPlaylistsPK that = (TracksInPlaylistsPK) o;

        if (playlistId != null ? !playlistId.equals(that.playlistId) : that.playlistId != null) return false;
        if (trackId != null ? !trackId.equals(that.trackId) : that.trackId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = playlistId != null ? playlistId.hashCode() : 0;
        result = 31 * result + (trackId != null ? trackId.hashCode() : 0);
        return result;
    }
}
