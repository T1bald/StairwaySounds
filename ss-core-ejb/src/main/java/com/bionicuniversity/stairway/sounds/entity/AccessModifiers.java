package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
@Table(name = "access_modifiers", schema = "", catalog = "stairway_sounds")
public class AccessModifiers {
    private Integer idAccessModifier;
    private String name;

    @Id
    @Column(name = "id_access_modifier")
    public Integer getIdAccessModifier() {
        return idAccessModifier;
    }

    public void setIdAccessModifier(Integer idAccessModifier) {
        this.idAccessModifier = idAccessModifier;
    }

    @Basic
    @Column(name = "name")
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

        AccessModifiers that = (AccessModifiers) o;

        if (idAccessModifier != null ? !idAccessModifier.equals(that.idAccessModifier) : that.idAccessModifier != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAccessModifier != null ? idAccessModifier.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
