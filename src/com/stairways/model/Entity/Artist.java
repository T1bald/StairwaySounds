package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 28.10.14.
 */
public class Artist implements Serializable{
    private int idArtist;
    private String pseudonym;
    private String description;

    public int getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(int idArtist) {
        this.idArtist = idArtist;
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

        Artist that = (Artist) o;

        if (idArtist != that.idArtist) return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        if (pseudonym != null ? !pseudonym.equals(that.pseudonym) : that.pseudonym != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArtist;
        result = 31 * result + (pseudonym != null ? pseudonym.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
