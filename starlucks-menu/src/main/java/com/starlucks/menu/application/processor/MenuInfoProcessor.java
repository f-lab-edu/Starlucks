package com.starlucks.menu.application.processor;

import com.starlucks.menu.application.result.MenuInfoResult;
import com.starlucks.menu.domain.repository.MenuRepository;
import java.util.List;

public class MenuInfoProcessor {

    private final MenuRepository menuRepository;

    public MenuInfoProcessor(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<MenuInfoResult> execute() {
        return menuRepository.findAll().stream().map(MenuInfoResult::from).toList();
    }

    public MenuInfoResult execute(Long menuId) {
        return MenuInfoResult.from(menuRepository.findById(menuId));
    }
}
