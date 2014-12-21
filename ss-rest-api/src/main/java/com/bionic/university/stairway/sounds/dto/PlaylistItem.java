package com.bionic.university.stairway.sounds.dto;

/**
 * Created by happy on 19/12/2014.
 */
public class PlaylistItem {
    private Integer id;
    private String author;
    private String title;
    private String mp3;
    private String poster;

    public PlaylistItem() {}

    public PlaylistItem(Integer id, String author, String title, String mp3, String poster) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.mp3 = mp3;
        this.poster = poster;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

        PlaylistItem item = (PlaylistItem) o;

        if (author != null ? !author.equals(item.author) : item.author != null) return false;
        if (id != null ? !id.equals(item.id) : item.id != null) return false;
        if (mp3 != null ? !mp3.equals(item.mp3) : item.mp3 != null) return false;
        if (poster != null ? !poster.equals(item.poster) : item.poster != null) return false;
        if (title != null ? !title.equals(item.title) : item.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (mp3 != null ? mp3.hashCode() : 0);
        result = 31 * result + (poster != null ? poster.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaylistItem{");
        sb.append("id=").append(id);
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", mp3='").append(mp3).append('\'');
        sb.append(", poster='").append(poster).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
