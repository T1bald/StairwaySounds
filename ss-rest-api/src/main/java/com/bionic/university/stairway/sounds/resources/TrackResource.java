package com.bionic.university.stairway.sounds.resources;

import com.bionic.university.stairway.sounds.dto.PlaylistDTO;
import com.bionicuniversity.stairway.sounds.entity.Playlist;
import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.track.TrackFacadeLocal;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by happy on 17/12/2014.
 */

@Path("/track")
@ManagedBean
public class TrackResource {

    @EJB
    private TrackFacadeLocal trackFacadeLocal;

    @Path("/popular")
    @GET
    @Produces("application/json")
    public Response getPopularTracks() {
        List<Track> trackList = trackFacadeLocal.findPopularTracks();


        return Response.ok("\"response\":\"ok\"").build();
    }

}
