package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by happy on 13/11/2014.
 */

@Entity
@Table(name = "users")
@AttributeOverride(name = "id", column = @Column(name = "id_user"))
//@NamedQueries(
//        @NamedQuery(name = "UserByEmail", query = "")
//)
public class User extends AbstractEntity {

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "pass_hash", length = 45)
    private String passHash;

    @Column(name = "pass_salt", length = 45)
    private String passSalt;

    @Column(name = "password", length = 64)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "users_have_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id_role")
    )
    private List<Role> role;

    @OneToMany(mappedBy = "owner")
    private List<Playlist> playlistList;

    @ManyToMany
    @JoinTable(
            name = "users_subscribe_hashtags",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "hashtag_id", referencedColumnName = "id_hashtag")
    )
    private List<Hashtag> subscribedHashTagList;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public List<Playlist> getPlaylistList() {
        return playlistList;
    }

    public void setPlaylistList(List<Playlist> playlistList) {
        this.playlistList = playlistList;
    }

    public List<Hashtag> getSubscribedHashTagList() {
        return subscribedHashTagList;
    }

    public void setSubscribedHashTagList(List<Hashtag> subscribedHashTagList) {
        this.subscribedHashTagList = subscribedHashTagList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (passHash != null ? !passHash.equals(user.passHash) : user.passHash != null) return false;
        if (passSalt != null ? !passSalt.equals(user.passSalt) : user.passSalt != null) return false;
        if (playlistList != null ? !playlistList.equals(user.playlistList) : user.playlistList != null) return false;
        if (role != null ? !role.equals(user.role) : user.role != null) return false;
        if (subscribedHashTagList != null ? !subscribedHashTagList.equals(user.subscribedHashTagList) : user.subscribedHashTagList != null)
            return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (passHash != null ? passHash.hashCode() : 0);
        result = 31 * result + (passSalt != null ? passSalt.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (playlistList != null ? playlistList.hashCode() : 0);
        result = 31 * result + (subscribedHashTagList != null ? subscribedHashTagList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("email='").append(email).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", passHash='").append(passHash).append('\'');
        sb.append(", passSalt='").append(passSalt).append('\'');
        sb.append(", role=").append(role);
        sb.append(", playlistList=").append(playlistList);
        sb.append(", subscribedHashTagList=").append(subscribedHashTagList);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
