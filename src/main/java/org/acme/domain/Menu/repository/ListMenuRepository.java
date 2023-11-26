package org.acme.domain.Menu.repository;

import org.acme.domain.Menu.models.Menu;

import java.util.List;

public interface ListMenuRepository {
    List<Menu> getAllMenus();
}
