package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "access_modifiers")
public class AccessModifier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_access_modifier")
    private Integer accessModifierId;

    @Column(name = "name", nullable = false)
    private String name;

    public Integer getAccessModifierId() {
        return accessModifierId;
    }

    public void setAccessModifierId(Integer idAccessModifier) {
        this.accessModifierId = idAccessModifier;
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

        AccessModifier that = (AccessModifier) o;

        if (accessModifierId != null ? !accessModifierId.equals(that.accessModifierId) : that.accessModifierId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accessModifierId != null ? accessModifierId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
