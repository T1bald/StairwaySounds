package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "raitings")
@AttributeOverride(name = "id", column = @Column(name = "id_raiting"))
public class Raiting extends AbstractEntity {

    @Column(name = "downloads")
    private Integer downloads;

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
        if (!super.equals(o)) return false;

        Raiting raiting = (Raiting) o;

        if (downloads != null ? !downloads.equals(raiting.downloads) : raiting.downloads != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (downloads != null ? downloads.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raiting{");
        sb.append("downloads=").append(downloads);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
