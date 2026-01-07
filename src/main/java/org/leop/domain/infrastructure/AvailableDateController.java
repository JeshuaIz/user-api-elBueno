package org.leop.domain.infrastructure;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.leop.domain.application.AvailableDateService;
import org.leop.domain.model.AvailableDate;

import java.util.List;

@Path("/dates")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AvailableDateController {

    @Inject
    AvailableDateService service;

    @GET
    public List<AvailableDate> getAll(){
        return service.findAll();
    }
}
