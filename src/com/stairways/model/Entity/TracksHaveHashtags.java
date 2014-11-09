package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 28.10.14.
 */
public class TracksHaveHashtags implements Serializable {
    private int trackId;
    private int hashtagId;

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public int getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(int hashtagId) {
        this.hashtagId = hashtagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TracksHaveHashtags that = (TracksHaveHashtags) o;

        if (hashtagId != that.hashtagId) return false;
        if (trackId != that.trackId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trackId;
        result = 31 * result + hashtagId;
        return result;
    }
}
