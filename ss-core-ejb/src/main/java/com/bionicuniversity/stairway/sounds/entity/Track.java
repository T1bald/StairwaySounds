package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "tracks")
@AttributeOverride(name = "id", column = @Column(name = "id_track"))
@NamedQuery(name="findAll", query="select t from Track t")
public class Track extends AbstractEntity {

    @Column(name = "track_name")
    private String trackName;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "duration")
    private String duration;

    @Column(name = "description", length = 65535)
    private String description;

    @ManyToOne
    @JoinColumn(name = "album_id", referencedColumnName = "id_album")
    private Album album;

    @OneToOne
    private Raiting raiting;

    @OneToOne
    private TrackAdditionalInfo additionalInfo;

    @ManyToMany
    @JoinTable(
            name = "tracks_have_hashtags",
            joinColumns = @JoinColumn(name = "track_id", referencedColumnName = "id_track"),
            inverseJoinColumns = @JoinColumn(name = "hashtag_id", referencedColumnName = "id_hashtag")
    )
    private List<Hashtag> hashtagList;

    @ManyToMany
    @JoinTable(
            name = "tracks_have_styles",
            joinColumns = @JoinColumn(name = "track_id", referencedColumnName = "id_track"),
            inverseJoinColumns = @JoinColumn(name = "styles_id", referencedColumnName = "id_style")
    )
    private  List<Style> styleList;

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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Raiting getRaiting() {
        return raiting;
    }

    public void setRaiting(Raiting raiting) {
        this.raiting = raiting;
    }

    public TrackAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(TrackAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public List<Hashtag> getHashtagList() {
        return hashtagList;
    }

    public void setHashtagList(List<Hashtag> hashtagList) {
        this.hashtagList = hashtagList;
    }

    public List<Style> getStyleList() {
        return styleList;
    }

    public void setStyleList(List<Style> styleList) {
        this.styleList = styleList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Track track = (Track) o;

        if (additionalInfo != null ? !additionalInfo.equals(track.additionalInfo) : track.additionalInfo != null)
            return false;
        if (album != null ? !album.equals(track.album) : track.album != null) return false;
        if (description != null ? !description.equals(track.description) : track.description != null) return false;
        if (duration != null ? !duration.equals(track.duration) : track.duration != null) return false;
        if (filePath != null ? !filePath.equals(track.filePath) : track.filePath != null) return false;
        if (hashtagList != null ? !hashtagList.equals(track.hashtagList) : track.hashtagList != null) return false;
        if (raiting != null ? !raiting.equals(track.raiting) : track.raiting != null) return false;
        if (styleList != null ? !styleList.equals(track.styleList) : track.styleList != null) return false;
        if (trackName != null ? !trackName.equals(track.trackName) : track.trackName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (trackName != null ? trackName.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (album != null ? album.hashCode() : 0);
        result = 31 * result + (raiting != null ? raiting.hashCode() : 0);
        result = 31 * result + (additionalInfo != null ? additionalInfo.hashCode() : 0);
        result = 31 * result + (hashtagList != null ? hashtagList.hashCode() : 0);
        result = 31 * result + (styleList != null ? styleList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Track{");
        sb.append("trackName='").append(trackName).append('\'');
        sb.append(", filePath='").append(filePath).append('\'');
        sb.append(", duration='").append(duration).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", album=").append(album);
        sb.append(", raiting=").append(raiting);
        sb.append(", additionalInfo=").append(additionalInfo);
        sb.append(", hashtagList=").append(hashtagList);
        sb.append(", styleList=").append(styleList);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
