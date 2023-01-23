package com.starlucks.menu.application.processor;

import com.starlucks.menu.application.result.MenuInfoResult;
import com.starlucks.menu.domain.entity.Menu;
import com.starlucks.menu.domain.entity.MenuOption;
import com.starlucks.menu.domain.repository.MenuOptionRepository;
import com.starlucks.menu.domain.repository.MenuRepository;
import java.util.List;

public class MenuInfoProcessor {

    private final MenuRepository menuRepository;
    private final MenuOptionRepository menuOptionRepository;

    public MenuInfoProcessor(
        MenuRepository menuRepository,
        MenuOptionRepository menuOptionRepository
    ) {
        this.menuRepository = menuRepository;
        this.menuOptionRepository = menuOptionRepository;
    }

    public List<MenuInfoResult> execute() {
        List<Menu> menus = menuRepository.findAll();
        List<MenuOption> menuOptions = menuOptionRepository.findAllByMenuIds(
            menus.stream().map(Menu::getId).toList()
        );

        return menus.stream().map(menu ->
            MenuInfoResult.from(
                menu,
                menuOptions.stream()
                    .filter(menuOption ->
                        menuOption.getMenuId().equals(menu.getId())
                    ).toList()
            )
        ).toList();
    }

    public MenuInfoResult execute(Long menuId) {
        Menu menu = menuRepository.findById(menuId);
        List<MenuOption> menuOptions = menuOptionRepository.findAllByMenuId(menu.getId());

        return MenuInfoResult.from(menu, menuOptions);
    }
}
