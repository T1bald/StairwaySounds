package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by happy on 13/11/2014.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private Integer userId;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "pass_hash", length = 45)
    private String passHash;

    @Column(name = "pass_salt", length = 45)
    private String passSalt;

    @OneToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id_role")
    private Role role;

    @OneToMany(mappedBy = "owner")
    private List<Playlist> playlistList;

    @ManyToMany
    @JoinTable(
            name = "users_subscribe_hashtags",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "hashtag_id", referencedColumnName = "id_hashtag")
    )
    private List<Hashtag> subscribedHashTagList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer idUser) {
        this.userId = idUser;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
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
        if (userId != null ? !userId.equals(user.userId) : user.userId != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
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
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", passHash='" + passHash + '\'' +
                ", passSalt='" + passSalt + '\'' +
                ", role=" + role +
                ", playlistList=" + playlistList +
                ", subscribedHashTagList=" + subscribedHashTagList +
                '}';
    }
}
