package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by happy on 09/11/2014.
 */
public class TracksHaveHashtagsPK implements Serializable {
    private Integer trackId;
    private Integer hashtagId;

    @Column(name = "track_id")
    @Id
    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @Column(name = "hashtag_id")
    @Id
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

        TracksHaveHashtagsPK that = (TracksHaveHashtagsPK) o;

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
}
