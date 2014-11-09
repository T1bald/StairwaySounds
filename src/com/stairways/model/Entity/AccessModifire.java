package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 28.10.14.
 */
public class AccessModifire implements Serializable{
    private int idAccessModifire;
    private String name;

    public int getIdAccessModifire() {
        return idAccessModifire;
    }

    public void setIdAccessModifire(int idAccessModifire) {
        this.idAccessModifire = idAccessModifire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccessModifire that = (AccessModifire) o;

        if (idAccessModifire != that.idAccessModifire) return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAccessModifire;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
