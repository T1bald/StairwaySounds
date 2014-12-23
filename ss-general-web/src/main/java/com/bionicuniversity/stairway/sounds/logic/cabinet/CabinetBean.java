package com.bionicuniversity.stairway.sounds.logic.cabinet;

import com.bionicuniversity.stairway.sounds.entity.Playlist;
import com.bionicuniversity.stairway.sounds.entity.User;
import com.bionicuniversity.stairway.sounds.facade.album.PlaylistFacade;
import com.bionicuniversity.stairway.sounds.facade.album.PlaylistFacadeLocal;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacade;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 23.12.2014.
 */
@ManagedBean
@RequestScoped
public class CabinetBean implements Serializable{

    public CabinetBean(){
        playLists = new ArrayList<Playlist>();

    }

    @EJB
    private PlaylistFacadeLocal playlistFacade;
    @EJB
    private UserFacadeLocal userFacade;

    private User currentUser;
    private String newAlbumName;
    private String newAlbumDescription;

    private List<Playlist> playLists;

    public String createAlbum(){
        if (!newAlbumName.isEmpty()) {
            Playlist playlist = new Playlist();
            playlist.setName(newAlbumName);
            playlist.setDescription(newAlbumDescription);
            playlist.setOwner(currentUser);
            playlistFacade.insert(playlist);
            playLists.add(playlist);
        }
        return "cabinet.xhtml";
    }

    public String redirectToCreationView(){
        return "addPlayList.xhtml";
    }


    public String openPlayList(Integer id){
        //TODO: open playList;
        return "Not implemented yet" + id;
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

    public String getNewAlbumName() {
        return newAlbumName;
    }

    public void setNewAlbumName(String newAlbumName) {
        this.newAlbumName = newAlbumName;
    }

    public String getNewAlbumDescription() {
        return newAlbumDescription;
    }

    public void setNewAlbumDescription(String newAlbumDescription) {
        this.newAlbumDescription = newAlbumDescription;
    }

}
