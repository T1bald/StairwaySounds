package com.bionic.university.stairway.sounds.resources;

import com.bionic.university.stairway.sounds.dto.Playlist;
import com.bionic.university.stairway.sounds.dto.PlaylistItem;
import com.bionic.university.stairway.sounds.services.TrackToPlaylistItemTransformer;
import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.track.TrackFacadeLocal;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by happy on 17/12/2014.
 */

@Path("/track")
@ManagedBean
public class TrackResource {

    @EJB
    private TrackFacadeLocal trackFacadeLocal;

    @Path("/all")
    @GET
    @Produces("application/json")
    public Response getAllTracks() {
        TrackToPlaylistItemTransformer transformer = new TrackToPlaylistItemTransformer();
        List<Track> trackList = trackFacadeLocal.findPopularTracks();
        Playlist playlist = new Playlist();
        playlist.setPlaylistItems(transformer.transformEntityList(trackList));
        return Response.ok(playlist).build();
    }

    @Path("/{id}")
    @GET
    @Produces("application/json")
    public Response getTrackById(@PathParam("id") Integer id) {
        Track track = trackFacadeLocal.findById(id);
        TrackToPlaylistItemTransformer transformer = new TrackToPlaylistItemTransformer();
        PlaylistItem playlistItem = transformer.transformEntity(track);
        return Response.ok(playlistItem).build();
    }


}
