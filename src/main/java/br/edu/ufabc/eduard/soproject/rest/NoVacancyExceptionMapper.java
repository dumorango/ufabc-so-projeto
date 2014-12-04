package br.edu.ufabc.eduard.soproject.rest;

/**
 * Created by dumorango on 28/10/14.
 */
import br.edu.ufabc.eduard.soproject.entities.NoVacancyException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NoVacancyExceptionMapper implements ExceptionMapper<NoVacancyException> {

    @Override
    public Response toResponse(NoVacancyException ex) {
        return Response.status(ex.getStatus())
                .entity(new ErrorMessage(ex.getMessage(),ex.getStatus()))
                .type(MediaType.APPLICATION_JSON).
                        build();
    }

}
