package org.acme.infrastructure.driver.entrypoint.Menu.config;

import org.acme.domain.Menu.models.Menu;
import org.acme.infrastructure.driven.postgresdriven.repositories.adapters.Menu.GetMenuPostgresRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ListMenuGetAllProduce {
    @Inject
    GetMenuPostgresRepository getMenuPostgresRepository;

    public List<Menu> getAllMenus() {
        return getMenuPostgresRepository.getAllMenus();
    }
}