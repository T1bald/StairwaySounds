package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 28.10.14.
 */
public class Hashtags implements Serializable{
    private int idHashtag;
    private String name;
    private String description;

    public int getIdHashtag() {
        return idHashtag;
    }

    public void setIdHashtag(int idHashtag) {
        this.idHashtag = idHashtag;
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

        Hashtags that = (Hashtags) o;

        if (idHashtag != that.idHashtag) return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHashtag;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
