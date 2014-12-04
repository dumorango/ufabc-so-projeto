package br.edu.ufabc.eduard.soproject.rest;

import br.edu.ufabc.eduard.soproject.entities.Voo;
import br.edu.ufabc.eduard.soproject.repositories.TravelRepository;
import br.edu.ufabc.eduard.soproject.repositories.TravelRepositoryImpl;
import org.glassfish.jersey.process.internal.RequestScoped;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by dumorango on 02/12/14.
 */

import br.edu.ufabc.eduard.soproject.lock.*;

@RequestScoped
@Path("reserva")
public class TravelResource {

    private final RWLock storeLock = new Database();
    private final TravelRepository travelRepository;
    public TravelResource(){
        travelRepository = TravelRepositoryImpl.getInstance();
    }

    @GET
    @Produces({"application/javascript", MediaType.APPLICATION_JSON})
    public List<Voo> getVoos() {
            storeLock.acquireReadLock();
                List<Voo> voos = travelRepository.getVoos();
            storeLock.releaseReadLock();
        return voos;
    }

    @POST
    @Path("{id}")
    @Produces({"application/javascript", MediaType.APPLICATION_JSON})
    public Voo reservarVoo(@PathParam("id") String id) throws Exception {
        storeLock.acquireWriteLock();
        Voo voo = travelRepository.reservarVoo(Long.valueOf(id));
        storeLock.releaseWriteLock();
        return voo;
    }

}
