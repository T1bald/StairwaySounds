package com.bionicuniversity.stairway.sounds.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by happy on 09/11/2014.
 */
public class UsersSubscribeHashtagsPK implements Serializable {
    private Integer userId;
    private Integer hashtagId;

    @Column(name = "user_id")
    @Id
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "hashtag_id")
    @Id
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

        UsersSubscribeHashtagsPK that = (UsersSubscribeHashtagsPK) o;

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
}
