package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_album", nullable = false)
    private Integer albumId;

    @Column(name = "name")
    private String name;

    @Column(name = "description", length = 65535)
    private String description;

    @Column(name = "cover", nullable = true, insertable = true, updatable = true)
    private byte[] cover;

    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id_artist")
    private Artist artist;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer idAlbum) {
        this.albumId = idAlbum;
    }

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

        Album album = (Album) o;

        if (albumId != null ? !albumId.equals(album.albumId) : album.albumId != null) return false;
        if (name != null ? !name.equals(album.name) : album.name != null) return false;
        if (!Arrays.equals(cover, album.cover)) return false;
        if (description != null ? !description.equals(album.description) : album.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = albumId != null ? albumId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (cover != null ? Arrays.hashCode(cover) : 0);
        return result;
    }
}
