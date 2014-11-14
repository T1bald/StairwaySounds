package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "artists")
@AttributeOverride(name = "id", column = @Column(name = "id_artist"))
public class Artist extends AbstractEntity {

    @Column(name = "pseudonym")
    private String pseudonym;

    @Column(name = "description", length = 65535)
    private String description;

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
        if (!super.equals(o)) return false;

        Artist artist = (Artist) o;

        if (description != null ? !description.equals(artist.description) : artist.description != null) return false;
        if (pseudonym != null ? !pseudonym.equals(artist.pseudonym) : artist.pseudonym != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pseudonym != null ? pseudonym.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Artist{");
        sb.append("pseudonym='").append(pseudonym).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
