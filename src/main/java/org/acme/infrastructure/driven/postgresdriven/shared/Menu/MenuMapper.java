package org.acme.infrastructure.driven.postgresdriven.shared.Menu;

import org.acme.infrastructure.driven.postgresdriven.entities.MenuEntity;
import org.acme.domain.Menu.models.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface MenuMapper {
    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    MenuEntity menuEntityToMenuEntity(Menu menu);

    Menu menuToMenuEntity(MenuEntity menuEntity);
}
