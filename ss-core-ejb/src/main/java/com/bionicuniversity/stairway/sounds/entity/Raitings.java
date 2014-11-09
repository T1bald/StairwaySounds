package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
public class Raitings {
    private Integer idRaiting;
    private String downloads;

    @Id
    @Column(name = "id_raiting")
    public Integer getIdRaiting() {
        return idRaiting;
    }

    public void setIdRaiting(Integer idRaiting) {
        this.idRaiting = idRaiting;
    }

    @Basic
    @Column(name = "downloads")
    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Raitings raitings = (Raitings) o;

        if (downloads != null ? !downloads.equals(raitings.downloads) : raitings.downloads != null) return false;
        if (idRaiting != null ? !idRaiting.equals(raitings.idRaiting) : raitings.idRaiting != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRaiting != null ? idRaiting.hashCode() : 0;
        result = 31 * result + (downloads != null ? downloads.hashCode() : 0);
        return result;
    }
}
