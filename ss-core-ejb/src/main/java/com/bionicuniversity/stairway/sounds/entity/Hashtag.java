package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "hashtags")
@AttributeOverride(name = "id", column = @Column(name = "id_hashtag"))
public class Hashtag extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", length = 65535)
    private String description;

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
        if (!super.equals(o)) return false;

        Hashtag hashtag = (Hashtag) o;

        if (description != null ? !description.equals(hashtag.description) : hashtag.description != null) return false;
        if (name != null ? !name.equals(hashtag.name) : hashtag.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hashtag{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
