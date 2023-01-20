package com.starlucks.menu.application.processor;

import com.starlucks.menu.domain.entity.Menu;
import com.starlucks.menu.domain.repository.MenuRepository;
import com.starlucks.menu.infrastructure.generator.MenuIdGenerator;

public class MenuAddProcessor {

    private final MenuRepository menuRepository;

    private final MenuIdGenerator menuIdGenerator;

    public MenuAddProcessor(MenuRepository menuRepository, MenuIdGenerator menuIdGenerator) {
        this.menuRepository = menuRepository;
        this.menuIdGenerator = menuIdGenerator;
    }

    public Long execute(Command command) {
        Menu menu = menuRepository.save(
            Menu.from(menuIdGenerator.generate(), command.menuName, command.menuPrice)
        );

        return menu.getId();
    }

    public static class Command {

        private final String menuName;
        private final long menuPrice;

        public Command(String menuName, long menuPrice) {
            this.menuName = menuName;
            this.menuPrice = menuPrice;
        }

        public String getMenuName() {
            return menuName;
        }

        public long getMenuPrice() {
            return menuPrice;
        }
    }

}
