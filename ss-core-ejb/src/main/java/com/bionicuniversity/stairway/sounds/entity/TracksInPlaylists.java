package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
@Table(name = "tracks_in_playlists", schema = "", catalog = "stairway_sounds")
@IdClass(TracksInPlaylistsPK.class)
public class TracksInPlaylists {
    private Integer playlistId;
    private Integer trackId;
    private Playlists playlistsByPlaylistId;
    private Tracks tracksByTrackId;

    @Id
    @Column(name = "playlist_id")
    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    @Id
    @Column(name = "track_id")
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

        TracksInPlaylists that = (TracksInPlaylists) o;

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

    @ManyToOne
    @JoinColumn(name = "playlist_id", referencedColumnName = "id_playlist", nullable = false)
    public Playlists getPlaylistsByPlaylistId() {
        return playlistsByPlaylistId;
    }

    public void setPlaylistsByPlaylistId(Playlists playlistsByPlaylistId) {
        this.playlistsByPlaylistId = playlistsByPlaylistId;
    }

    @ManyToOne
    @JoinColumn(name = "track_id", referencedColumnName = "id_track", nullable = false)
    public Tracks getTracksByTrackId() {
        return tracksByTrackId;
    }

    public void setTracksByTrackId(Tracks tracksByTrackId) {
        this.tracksByTrackId = tracksByTrackId;
    }
}
