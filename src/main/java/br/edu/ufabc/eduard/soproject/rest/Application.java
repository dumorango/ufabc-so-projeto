package br.edu.ufabc.eduard.soproject.rest;

/**
 * Created by dumorango on 02/12/14.
 */

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class Application extends ResourceConfig {

    public Application() {
        register(TravelResource.class);
        register(NoVacancyExceptionMapper.class);
    }
}
