package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "raitings")
public class Raiting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_raiting")
    private Integer raitingId;

    @Column(name = "downloads")
    private Integer downloads;

    public Integer getRaitingId() {
        return raitingId;
    }

    public void setRaitingId(Integer idRaiting) {
        this.raitingId = idRaiting;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Raiting raiting = (Raiting) o;

        if (downloads != null ? !downloads.equals(raiting.downloads) : raiting.downloads != null) return false;
        if (raitingId != null ? !raitingId.equals(raiting.raitingId) : raiting.raitingId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = raitingId != null ? raitingId.hashCode() : 0;
        result = 31 * result + (downloads != null ? downloads.hashCode() : 0);
        return result;
    }
}
