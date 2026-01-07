package org.leop.domain.infrastructure;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.leop.domain.application.UserRequestDTO;
import org.leop.domain.application.UserService;
import org.leop.domain.model.User;

import java.util.List;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Controller {

    @Inject
    UserService service;

    @POST
    public Response create(@Valid UserRequestDTO dto) {
        service.create(dto);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    public List<User> getAll() {
        return service.findAll();
    }
}


