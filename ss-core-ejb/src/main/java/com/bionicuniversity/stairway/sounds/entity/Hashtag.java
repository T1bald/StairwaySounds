package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "hashtags")
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_hashtag")
    private Integer hashtagId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", length = 65535)
    private String description;

    public Integer getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(Integer idHashtag) {
        this.hashtagId = idHashtag;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hashtag hashtag = (Hashtag) o;

        if (hashtagId != null ? !hashtagId.equals(hashtag.hashtagId) : hashtag.hashtagId != null) return false;
        if (name != null ? !name.equals(hashtag.name) : hashtag.name != null) return false;
        if (description != null ? !description.equals(hashtag.description) : hashtag.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hashtagId != null ? hashtagId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
