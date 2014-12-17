package com.bionic.university.stairway.sounds.resources;

import com.bionic.university.stairway.sounds.config.TrackResource;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by happy on 17/12/2014.
 */
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig() {
        register(TrackResource.class);
    }
}