package org.acme.applications.usecases.Menu.ports;

import org.acme.domain.Menu.models.Menu;

public interface RegistryMenuPort {
    Boolean save(Menu menu);
}
