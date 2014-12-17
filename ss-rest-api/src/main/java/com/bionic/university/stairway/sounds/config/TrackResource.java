package com.bionic.university.stairway.sounds.config;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by happy on 17/12/2014.
 */

@Path("/track")
public class TrackResource {


    @Path("/popular")
    @GET
    @Produces("application/json")
    public Response getPopularTracks() {
        return Response.ok("{\"test\":\"ok\"}").build();
    }
}
