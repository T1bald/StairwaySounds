package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.*;

/**
 * Created by happy on 09/11/2014.
 */
@Entity
@Table(name = "users_subscribe_hashtags", schema = "", catalog = "stairway_sounds")
@IdClass(UsersSubscribeHashtagsPK.class)
public class UsersSubscribeHashtags {
    private Integer userId;
    private Integer hashtagId;
    private Hashtags hashtagsByHashtagId;
    private Users usersByUserId;

    @Id
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "hashtag_id")
    public Integer getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(Integer hashtagId) {
        this.hashtagId = hashtagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersSubscribeHashtags that = (UsersSubscribeHashtags) o;

        if (hashtagId != null ? !hashtagId.equals(that.hashtagId) : that.hashtagId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (hashtagId != null ? hashtagId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "hashtag_id", referencedColumnName = "id_hashtag", nullable = false)
    public Hashtags getHashtagsByHashtagId() {
        return hashtagsByHashtagId;
    }

    public void setHashtagsByHashtagId(Hashtags hashtagsByHashtagId) {
        this.hashtagsByHashtagId = hashtagsByHashtagId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id_user", nullable = false)
    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }
}
