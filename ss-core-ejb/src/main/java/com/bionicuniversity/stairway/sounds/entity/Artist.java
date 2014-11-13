package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_artist")
    private Integer artistId;

    @Column(name = "pseudonym")
    private String pseudonym;

    @Column(name = "description", length = 65535)
    private String description;

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer idArtist) {
        this.artistId = idArtist;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

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

        Artist artist = (Artist) o;

        if (description != null ? !description.equals(artist.description) : artist.description != null) return false;
        if (artistId != null ? !artistId.equals(artist.artistId) : artist.artistId != null) return false;
        if (pseudonym != null ? !pseudonym.equals(artist.pseudonym) : artist.pseudonym != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artistId != null ? artistId.hashCode() : 0;
        result = 31 * result + (pseudonym != null ? pseudonym.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
