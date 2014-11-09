package com.stairways.model.Entity;

import java.io.Serializable;

/**
 * Created by matvey on 28.10.14.
 */
public class UsersSubscribeHashtags implements Serializable {
    private int userId;
    private int hashtagId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(int hashtagId) {
        this.hashtagId = hashtagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersSubscribeHashtags that = (UsersSubscribeHashtags) o;

        if (hashtagId != that.hashtagId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + hashtagId;
        return result;
    }
}
