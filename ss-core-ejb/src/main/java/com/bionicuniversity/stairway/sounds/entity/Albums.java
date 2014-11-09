package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
public class Albums {
    private Integer idAlbum;
    private String name;
    private String description;
    private byte[] cover;

    @Id
    @Column(name = "id_album")
    public Integer getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "cover")
    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Albums albums = (Albums) o;

        if (!Arrays.equals(cover, albums.cover)) return false;
        if (description != null ? !description.equals(albums.description) : albums.description != null) return false;
        if (idAlbum != null ? !idAlbum.equals(albums.idAlbum) : albums.idAlbum != null) return false;
        if (name != null ? !name.equals(albums.name) : albums.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAlbum != null ? idAlbum.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (cover != null ? Arrays.hashCode(cover) : 0);
        return result;
    }
}
