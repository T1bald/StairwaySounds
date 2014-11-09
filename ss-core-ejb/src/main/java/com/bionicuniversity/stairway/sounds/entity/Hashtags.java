package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
public class Hashtags {
    private Integer idHashtag;
    private String name;
    private String description;

    @Id
    @Column(name = "id_hashtag")
    public Integer getIdHashtag() {
        return idHashtag;
    }

    public void setIdHashtag(Integer idHashtag) {
        this.idHashtag = idHashtag;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hashtags hashtags = (Hashtags) o;

        if (description != null ? !description.equals(hashtags.description) : hashtags.description != null)
            return false;
        if (idHashtag != null ? !idHashtag.equals(hashtags.idHashtag) : hashtags.idHashtag != null) return false;
        if (name != null ? !name.equals(hashtags.name) : hashtags.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHashtag != null ? idHashtag.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
