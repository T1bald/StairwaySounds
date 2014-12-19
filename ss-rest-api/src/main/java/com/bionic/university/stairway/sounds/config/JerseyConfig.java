package com.bionic.university.stairway.sounds.config;

import com.bionic.university.stairway.sounds.resources.TrackResource;
import com.bionicuniversity.stairway.sounds.facade.track.TrackFacade;
import com.bionicuniversity.stairway.sounds.facade.track.TrackFacadeLocal;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by happy on 17/12/2014.
 */
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig() {
//        register(new AbstractBinder() {
//            @Override
//            protected void configure() {
//                bind(TrackFacade.class).to(TrackFacadeLocal.class);
//            }
//        });
        register(TrackResource.class);
    }
}
