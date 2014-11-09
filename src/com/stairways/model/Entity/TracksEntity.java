package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 28.10.14.
 */
public class TracksEntity implements Serializable{

    private int idTrack;
    private String trackName;
    private String filePath;
    private Integer price;
    private String duration;
    private String description;
    private int authorId;
    private int albumId;
    private int ratingId;

    public TracksEntity() {
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(int idTrack) {
        this.idTrack = idTrack;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return trackName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TracksEntity that = (TracksEntity) o;

        if (idTrack != that.idTrack) return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null)
            return false;
        if (filePath != null ? !filePath.equals(that.filePath) : that.filePath != null)
            return false;
        if (trackName != null ? !trackName.equals(that.trackName) : that.trackName != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTrack;
        result = 31 * result + (trackName != null ? trackName.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
