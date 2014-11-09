package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
public class Tracks {
    private Integer idTrack;
    private String trackName;
    private String filePath;
    private String duration;
    private String description;
    private Albums albumsByAlbumId;
    private Raitings raitingsByRaitingId;

    @Id
    @Column(name = "id_track")
    public Integer getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(Integer idTrack) {
        this.idTrack = idTrack;
    }

    @Basic
    @Column(name = "track_name")
    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    @Basic
    @Column(name = "file_path")
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "duration")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tracks tracks = (Tracks) o;

        if (description != null ? !description.equals(tracks.description) : tracks.description != null) return false;
        if (duration != null ? !duration.equals(tracks.duration) : tracks.duration != null) return false;
        if (filePath != null ? !filePath.equals(tracks.filePath) : tracks.filePath != null) return false;
        if (idTrack != null ? !idTrack.equals(tracks.idTrack) : tracks.idTrack != null) return false;
        if (trackName != null ? !trackName.equals(tracks.trackName) : tracks.trackName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTrack != null ? idTrack.hashCode() : 0;
        result = 31 * result + (trackName != null ? trackName.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "album_id", referencedColumnName = "id_album")
    public Albums getAlbumsByAlbumId() {
        return albumsByAlbumId;
    }

    public void setAlbumsByAlbumId(Albums albumsByAlbumId) {
        this.albumsByAlbumId = albumsByAlbumId;
    }

    @ManyToOne
    @JoinColumn(name = "raiting_id", referencedColumnName = "id_raiting")
    public Raitings getRaitingsByRaitingId() {
        return raitingsByRaitingId;
    }

    public void setRaitingsByRaitingId(Raitings raitingsByRaitingId) {
        this.raitingsByRaitingId = raitingsByRaitingId;
    }
}
