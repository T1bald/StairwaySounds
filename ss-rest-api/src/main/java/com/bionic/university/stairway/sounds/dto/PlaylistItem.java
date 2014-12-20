package com.bionic.university.stairway.sounds.dto;

/**
 * Created by happy on 19/12/2014.
 */
public class PlaylistItem {
    private String author;
    private String title;
    private String mp3;
    private String poster;

    public PlaylistItem() {}

    public PlaylistItem(String author, String title, String mp3, String poster) {
        this.author = author;
        this.title = title;
        this.mp3 = mp3;
        this.poster = poster;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMp3() {
        return mp3;
    }

    public void setMp3(String mp3) {
        this.mp3 = mp3;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaylistItem that = (PlaylistItem) o;

        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (mp3 != null ? !mp3.equals(that.mp3) : that.mp3 != null) return false;
        if (poster != null ? !poster.equals(that.poster) : that.poster != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (mp3 != null ? mp3.hashCode() : 0);
        result = 31 * result + (poster != null ? poster.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaylistItemDTO{");
        sb.append("author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", mp3='").append(mp3).append('\'');
        sb.append(", poster='").append(poster).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
