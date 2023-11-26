package org.acme.infrastructure.driver.entrypoint.Menu.resources;

import org.acme.infrastructure.driver.entrypoint.presenters.CustomPresenter;
import org.acme.domain.Menu.models.Menu;
import org.acme.infrastructure.driven.postgresdriven.repositories.adapters.Menu.GetMenuPostgresRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Base64;
import java.util.List;

@Path("/get-menu")
public class MenuGetAllResource {
    @Inject
    GetMenuPostgresRepository getMenuPostgresRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllMenus() {
        List<Menu> menuEntityList = getMenuPostgresRepository.getAllMenus();
        try {
            Response.Status status = Response.Status.OK;
            CustomPresenter presenter = CustomPresenter.init();
            presenter.setReason(status.getReasonPhrase());
            presenter.setStatusCode(status.getStatusCode());
            presenter.setMessage("Menu list, query successfully completed");
            ObjectMapper mapper = new ObjectMapper();
            presenter.setData(Base64.getEncoder().encode(mapper.writeValueAsString(menuEntityList).getBytes()));
            return Response.status(status).entity(menuEntityList).build();
        } catch (JsonProcessingException e) {
            Response.Status status = Response.Status.INTERNAL_SERVER_ERROR;
            CustomPresenter presenter = CustomPresenter.init();
            presenter.setReason(status.getReasonPhrase());
            presenter.setStatusCode(status.getStatusCode());
            presenter.setMessage("Menu not found");
            presenter.setData(null);
            return Response.status(status).entity(presenter).build();
        }
    }
}
