package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
public class Playlists {
    private Integer idPlaylist;
    private String name;
    private String description;
    private AccessModifiers accessModifiersByAccessModifierId;

    @Id
    @Column(name = "id_playlist")
    public Integer getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(Integer idPlaylist) {
        this.idPlaylist = idPlaylist;
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

        Playlists playlists = (Playlists) o;

        if (description != null ? !description.equals(playlists.description) : playlists.description != null)
            return false;
        if (idPlaylist != null ? !idPlaylist.equals(playlists.idPlaylist) : playlists.idPlaylist != null) return false;
        if (name != null ? !name.equals(playlists.name) : playlists.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPlaylist != null ? idPlaylist.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "access_modifier_id", referencedColumnName = "id_access_modifier", nullable = false)
    public AccessModifiers getAccessModifiersByAccessModifierId() {
        return accessModifiersByAccessModifierId;
    }

    public void setAccessModifiersByAccessModifierId(AccessModifiers accessModifiersByAccessModifierId) {
        this.accessModifiersByAccessModifierId = accessModifiersByAccessModifierId;
    }
}
