package com.starlucks.menu.application.processor;

import com.starlucks.menu.application.command.MenuAddCommand;
import com.starlucks.menu.domain.entity.Menu;
import com.starlucks.menu.domain.entity.MenuOption;
import com.starlucks.menu.domain.repository.MenuOptionRepository;
import com.starlucks.menu.domain.repository.MenuRepository;
import com.starlucks.menu.infrastructure.generator.MenuIdGenerator;
import com.starlucks.menu.infrastructure.generator.MenuOptionIdGenerator;

public final class MenuAddProcessor {

    private final MenuRepository menuRepository;
    private final MenuOptionRepository menuOptionRepository;
    private final MenuIdGenerator menuIdGenerator;
    private final MenuOptionIdGenerator menuOptionIdGenerator;

    public MenuAddProcessor(
        MenuRepository menuRepository,
        MenuOptionRepository menuOptionRepository,
        MenuIdGenerator menuIdGenerator,
        MenuOptionIdGenerator menuOptionIdGenerator
    ) {
        this.menuRepository = menuRepository;
        this.menuOptionRepository = menuOptionRepository;
        this.menuIdGenerator = menuIdGenerator;
        this.menuOptionIdGenerator = menuOptionIdGenerator;
    }

    public Long execute(MenuAddCommand command) {
        Long menuId = menuRepository.save(
            Menu.from(
                menuIdGenerator.generate(), command.menuName(), command.menuPrice(), command.size()
            )
        ).getId();

        menuOptionRepository.saveAll(
            command.menuOptionAddCommands().stream().map(menuOptionAddCommand ->
                MenuOption.from(
                    menuOptionIdGenerator.generate(),
                    menuId,
                    menuOptionAddCommand.name(),
                    menuOptionAddCommand.optionCategory(),
                    menuOptionAddCommand.defaultOption()
                )
            ).toList()
        );

        return menuId;
    }
}
