package org.acme.infrastructure.driven.postgresdriven.repositories.ports.Menu;

import org.acme.infrastructure.driven.postgresdriven.entities.MenuEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.UUID;

import java.util.List;

@ApplicationScoped
public class MenuModuleJpaRepository implements PanacheRepositoryBase<MenuEntity, UUID> {
    public List<MenuEntity> getAllMenus() {
        return listAll();
    }
}
