package com.bionic.university.stairway.sounds.resources;

import com.bionic.university.stairway.sounds.dto.Playlist;
import com.bionic.university.stairway.sounds.services.TrackToPlaylistItemTransformer;
import com.bionic.university.stairway.sounds.services.ValidationService;
import com.bionicuniversity.stairway.sounds.entity.Track;
import com.bionicuniversity.stairway.sounds.facade.track.TrackFacadeLocal;
import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by root on 22.12.14.
 */
public class UserResource {

    @Path("/user")
    @ManagedBean
    public class TrackResource {

        @EJB
        private UserFacadeLocal userFacadeLocal;

        @Path("/validate/{token}")
        @GET
        @Produces("application/json")
        public Response validateUser(@PathParam("token") String userToken){

            if (ValidationService.validate(userToken))
                return Response.ok("Your account successfuli activated!")
                        .build();
            else
            return Response.ok("Error while account account activation, " +
                    "your token is wrong")
                    .build();
        }

    }
}
