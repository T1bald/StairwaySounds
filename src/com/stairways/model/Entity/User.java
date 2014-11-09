package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 14.10.14.
 */
public class User implements Serializable {


    private int idUser;
    private String email;
    private String username;
    private String passHash;
    private String passSalt;
    private int roleId;

    public User() {

    }


    @Override
    public String toString() {
        return username;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassHash() {
        return passHash;
    }

    public void setPassHash(String passHash) {
        this.passHash = passHash;
    }

    public String getPassSalt() {
        return passSalt;
    }

    public void setPassSalt(String passSalt) {
        this.passSalt = passSalt;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (idUser != that.idUser) return false;
        if (email != null ? !email.equals(that.email) : that.email != null)
            return false;
        if (passHash != null ? !passHash.equals(that.passHash) : that.passHash != null)
            return false;
        if (passSalt != null ? !passSalt.equals(that.passSalt) : that.passSalt != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (passHash != null ? passHash.hashCode() : 0);
        result = 31 * result + (passSalt != null ? passSalt.hashCode() : 0);
        return result;
    }
}