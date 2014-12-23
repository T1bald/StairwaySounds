package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "playlists")
@AttributeOverride(name = "id", column = @Column(name = "id_playlist"))
public class Playlist extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description", length = 65535)
    private String description;

    @ManyToOne
    @JoinColumn(name = "access_modifier_id")
    private AccessModifier accessModifier;

    @ManyToMany
    @JoinTable(
        name = "tracks_in_playlists",
        joinColumns = @JoinColumn(name = "playlist_id", referencedColumnName = "id_playlist"),
        inverseJoinColumns = @JoinColumn(name = "track_id", referencedColumnName = "id_track")
    )
    private List<Track> trackList;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id_user")
    private User owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return super.getId();
    }

    @Override
    public void setId(Integer value){
        super.setId(value);
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User user) {
        this.owner = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Playlist playlist = (Playlist) o;

        if (accessModifier != null ? !accessModifier.equals(playlist.accessModifier) : playlist.accessModifier != null)
            return false;
        if (description != null ? !description.equals(playlist.description) : playlist.description != null)
            return false;
        if (name != null ? !name.equals(playlist.name) : playlist.name != null) return false;
        if (owner != null ? !owner.equals(playlist.owner) : playlist.owner != null) return false;
        if (trackList != null ? !trackList.equals(playlist.trackList) : playlist.trackList != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (accessModifier != null ? accessModifier.hashCode() : 0);
        result = 31 * result + (trackList != null ? trackList.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Playlist{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", accessModifier=").append(accessModifier);
        sb.append(", trackList=").append(trackList);
        sb.append(", owner=").append(owner);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
