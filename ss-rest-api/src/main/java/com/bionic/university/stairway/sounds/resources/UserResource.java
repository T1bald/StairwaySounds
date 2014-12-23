package com.bionic.university.stairway.sounds.resources;

import com.bionic.university.stairway.sounds.services.ValidationService;
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
 * Created by Matvey 23.12.14
 */

@Path("/user")
@ManagedBean
public class UserResource {

        @EJB
        private UserFacadeLocal userFacadeLocal;

        @Path("/validate/{token}")
        @GET
        @Produces("application/json")
        public Response validateUser(@PathParam("token") String userToken){
            System.out.println("from /validate " +
                    "start ============================");
            if (ValidationService.validate(userToken))
                return Response.ok("Your account successfully activated!")
                        .build();
            else
            return Response.ok("Error while account account activation, " +
                    "your token is wrong")
                    .build();
        }
}
