package org.acme.infrastructure.driven.postgresdriven.repositories.adapters.Menu;

import org.acme.infrastructure.driven.postgresdriven.entities.MenuEntity;
import org.acme.domain.Menu.models.Menu;
import org.acme.domain.Menu.repository.ListMenuRepository;
import org.acme.infrastructure.driven.postgresdriven.repositories.ports.Menu.MenuModuleJpaRepository;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class GetMenuPostgresRepository implements ListMenuRepository {
    private MenuModuleJpaRepository menuModuleJpaRepository;

    private GetMenuPostgresRepository(MenuModuleJpaRepository menuModuleJpaRepository) {
        this.menuModuleJpaRepository = menuModuleJpaRepository;
    }

    public static GetMenuPostgresRepository init(MenuModuleJpaRepository menuModuleJpaRepository) {
        return new GetMenuPostgresRepository(menuModuleJpaRepository);
    }

    @Override
    public List<Menu> getAllMenus() {
        List<MenuEntity> listEntity = menuModuleJpaRepository.getAllMenus();
        List<Menu> menu = new ArrayList<>();
        listEntity.forEach(e -> {
            Menu menu1 = Menu.init(e.getUuid(), e.getKey(), e.getTitle(), e.getIcon(), e.getUrl(), e.getUuidmodule(),
                    e.getIdparent());
            menu.add(menu1);
        });
        return menu;
    }

}
