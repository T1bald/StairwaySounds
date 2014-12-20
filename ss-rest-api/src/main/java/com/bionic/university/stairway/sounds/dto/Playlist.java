package com.bionic.university.stairway.sounds.dto;

import java.util.List;

/**
 * Created by happy on 20/12/2014.
 */
public class Playlist {
    private List<PlaylistItem> playlistItems;

    public Playlist() {}

    public Playlist(List<PlaylistItem> playlistItems) {
        this.playlistItems = playlistItems;
    }

    public List<PlaylistItem> getPlaylistItems() {
        return playlistItems;
    }

    public void setPlaylistItems(List<PlaylistItem> playlistItems) {
        this.playlistItems = playlistItems;
    }
}
