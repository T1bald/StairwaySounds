package com.bionicuniversity.stairway.sounds.logic.cabinet;

import com.bionicuniversity.stairway.sounds.entity.Playlist;
import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.album.PlaylistFacade;
import com.bionicuniversity.stairway.sounds.facade.album.PlaylistFacadeLocal;
import com.bionicuniversity.stairway.sounds.facade.track.TrackFacade;
import com.bionicuniversity.stairway.sounds.facade.track.TrackFacadeLocal;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacade;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 23.12.2014.
 */
@ManagedBean
@SessionScoped
public class CabinetBean implements Serializable{

    public CabinetBean(){
        playLists = new ArrayList<Playlist>();
    }

    @EJB
    private PlaylistFacadeLocal playlistFacade;
    @EJB
    private UserFacadeLocal userFacade;
    @EJB
    private TrackFacadeLocal trackFacade;

    private User currentUser;
    private String newPlaylistName;
    private String newPlaylistDescription;
    private Playlist selectedPlayList;
    private List<Track> trackList;

    private List<Playlist> playLists;

    public String createPlaylist(){
        if (!newPlaylistName.isEmpty()) {
            Playlist playlist = new Playlist();
            playlist.setName(newPlaylistName);
            playlist.setDescription(newPlaylistDescription);
            playlist.setOwner(currentUser);
            playlistFacade.insert(playlist);
            playLists.add(playlist);
        }
        return "cabinet.xhtml";
    }

    public String addToPlaylist(Integer trackId){

        selectedPlayList.getTrackList().add(trackFacade.findById(trackId));
        playlistFacade.insertOrUpdate(selectedPlayList);
        return "playlist.xhtml";
    }

    public String redirectToCreationView(){
        return "addPlayList.xhtml";
    }


    public String openPlayList(Integer id){
        setSelectedPlayList(playlistFacade.findById(id));
        return "playlist.xhtml";
    }

    public String addTrackToPlayList(){
        return "addTrackToPlaylist.xhtml";
    }

    public void loadAllTracks(){
         setTrackList(trackFacade.findPopularTracks());
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    public Playlist getSelectedPlayList() {
        return selectedPlayList;
    }

    public void setSelectedPlayList(Playlist selectedPlayList) {
        this.selectedPlayList = selectedPlayList;
    }

    public List<Playlist> getPlayLists() {
        return playLists;
    }

    public void setPlayLists(List<Playlist> playLists) {
        this.playLists = playLists;
    }

    public void loadPlayLists(){
        setPlayLists(playlistFacade.getAllByUser(currentUser.getId()));
    }

    public void setCurrentUser(String currentUserEmail){
        currentUser = userFacade.findByEmail(currentUserEmail);
    }

    public String getNewPlaylistName() {
        return newPlaylistName;
    }

    public void setNewPlaylistName(String newAlbumName) {
        this.newPlaylistName = newAlbumName;
    }

    public String getNewPlaylistDescription() {
        return newPlaylistDescription;
    }

    public void setNewPlaylistDescription(String newAlbumDescription) {
        this.newPlaylistDescription = newAlbumDescription;
    }

}
