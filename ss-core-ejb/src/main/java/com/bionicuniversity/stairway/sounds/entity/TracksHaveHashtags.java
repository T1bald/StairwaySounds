package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
@Table(name = "tracks_have_hashtags", schema = "", catalog = "stairway_sounds")
@IdClass(TracksHaveHashtagsPK.class)
public class TracksHaveHashtags {
    private Integer trackId;
    private Integer hashtagId;
    private Tracks tracksByTrackId;
    private Hashtags hashtagsByHashtagId;

    @Id
    @Column(name = "track_id")
    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @Id
    @Column(name = "hashtag_id")
    public Integer getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(Integer hashtagId) {
        this.hashtagId = hashtagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TracksHaveHashtags that = (TracksHaveHashtags) o;

        if (hashtagId != null ? !hashtagId.equals(that.hashtagId) : that.hashtagId != null) return false;
        if (trackId != null ? !trackId.equals(that.trackId) : that.trackId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trackId != null ? trackId.hashCode() : 0;
        result = 31 * result + (hashtagId != null ? hashtagId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "track_id", referencedColumnName = "id_track", nullable = false)
    public Tracks getTracksByTrackId() {
        return tracksByTrackId;
    }

    public void setTracksByTrackId(Tracks tracksByTrackId) {
        this.tracksByTrackId = tracksByTrackId;
    }

    @ManyToOne
    @JoinColumn(name = "hashtag_id", referencedColumnName = "id_hashtag", nullable = false)
    public Hashtags getHashtagsByHashtagId() {
        return hashtagsByHashtagId;
    }

    public void setHashtagsByHashtagId(Hashtags hashtagsByHashtagId) {
        this.hashtagsByHashtagId = hashtagsByHashtagId;
    }
}
