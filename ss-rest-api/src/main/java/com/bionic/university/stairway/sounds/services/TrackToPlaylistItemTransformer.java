package com.bionic.university.stairway.sounds.services;

import com.bionic.university.stairway.sounds.dto.PlaylistItem;
import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.util.ContentProperty;
import com.bionicuniversity.stairway.sounds.util.PropertyFile;
import com.bionicuniversity.stairway.sounds.util.PropertyHandler;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by happy on 20/12/2014.
 */
public class TrackToPlaylistItemTransformer {

    private PropertyHandler propertyHandler;

    public TrackToPlaylistItemTransformer() {
        try {
            propertyHandler = new PropertyHandler(PropertyFile.CONTENT.getFileName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PlaylistItem transformEntity(Track track) {
        PlaylistItem item = new PlaylistItem();
        item.setId(track.getId());
        item.setAuthor(track.getAlbum().getArtist().getPseudonym());
        item.setTitle(track.getTrackName());
        item.setMp3(propertyHandler.getProperty(ContentProperty.MUSIC.getProperty())
                + track.getFilePath());
        item.setPoster(propertyHandler.getProperty(ContentProperty.PICTURE.getProperty())
                + track.getAlbum().getCover());
        return item;
    }

    public List<PlaylistItem> transformEntityList(List<Track> trackList) {
        List<PlaylistItem> playlistItems = new LinkedList<PlaylistItem>();
        for (Track track : trackList)
            playlistItems.add(transformEntity(track));
        return playlistItems;
    }
}
