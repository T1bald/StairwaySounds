package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "albums")
@AttributeOverride(name = "id", column = @Column(name = "id_album"))
public class Album extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description", length = 65535)
    private String description;

    @Column(name = "cover", nullable = true, insertable = true, updatable = true)
    private byte[] cover;

    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id_artist")
    private Artist artist;

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

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artistsByArtistId) {
        this.artist = artistsByArtistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Album album = (Album) o;

        if (artist != null ? !artist.equals(album.artist) : album.artist != null) return false;
        if (!Arrays.equals(cover, album.cover)) return false;
        if (description != null ? !description.equals(album.description) : album.description != null) return false;
        if (name != null ? !name.equals(album.name) : album.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (cover != null ? Arrays.hashCode(cover) : 0);
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Album{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", cover=").append(Arrays.toString(cover));
        sb.append(", artist=").append(artist);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
