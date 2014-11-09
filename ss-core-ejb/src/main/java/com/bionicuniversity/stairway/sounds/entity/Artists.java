package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
public class Artists {
    private Integer idArtist;
    private String pseudonym;
    private String description;

    @Id
    @Column(name = "id_artist")
    public Integer getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Integer idArtist) {
        this.idArtist = idArtist;
    }

    @Basic
    @Column(name = "pseudonym")
    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
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

        Artists artists = (Artists) o;

        if (description != null ? !description.equals(artists.description) : artists.description != null) return false;
        if (idArtist != null ? !idArtist.equals(artists.idArtist) : artists.idArtist != null) return false;
        if (pseudonym != null ? !pseudonym.equals(artists.pseudonym) : artists.pseudonym != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArtist != null ? idArtist.hashCode() : 0;
        result = 31 * result + (pseudonym != null ? pseudonym.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
