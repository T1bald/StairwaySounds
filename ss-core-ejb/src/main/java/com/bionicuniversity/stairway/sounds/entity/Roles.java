package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
public class Roles {
    private Integer idRole;
    private String name;

    @Id
    @Column(name = "id_role")
    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
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

        Roles roles = (Roles) o;

        if (idRole != null ? !idRole.equals(roles.idRole) : roles.idRole != null) return false;
        if (name != null ? !name.equals(roles.name) : roles.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRole != null ? idRole.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
