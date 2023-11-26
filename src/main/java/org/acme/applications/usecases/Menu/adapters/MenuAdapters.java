package org.acme.applications.usecases.Menu.adapters;

import org.acme.domain.Menu.models.Menu;
import org.acme.applications.usecases.Menu.ports.RegistryMenuPort;
import org.acme.domain.Menu.repository.MenuRepository;

public class MenuAdapters implements RegistryMenuPort {
    private MenuRepository menuRepository;

    public MenuAdapters(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public static MenuAdapters init(MenuRepository menuRepository) {
        return new MenuAdapters(menuRepository);
    }

    @Override
    public Boolean save(Menu menu) {
        this.menuRepository.save(menu);
        return true;
    }
}
