package com.starlucks.menu.application.processor;

import com.starlucks.menu.application.command.MenuAddCommand;
import com.starlucks.menu.domain.entity.Menu;
import com.starlucks.menu.domain.repository.MenuRepository;
import com.starlucks.menu.infrastructure.generator.MenuIdGenerator;

public final class MenuAddProcessor {

    private final MenuRepository menuRepository;
    private final MenuIdGenerator menuIdGenerator;

    public MenuAddProcessor(
        MenuRepository menuRepository,
        MenuIdGenerator menuIdGenerator
    ) {
        this.menuRepository = menuRepository;
        this.menuIdGenerator = menuIdGenerator;
    }

    public Long execute(MenuAddCommand command) {
        return menuRepository.save(Menu.from(menuIdGenerator.generate(), command)).getId();
    }
}
