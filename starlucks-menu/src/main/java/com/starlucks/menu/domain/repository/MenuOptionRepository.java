package com.starlucks.menu.domain.repository;

import com.starlucks.menu.domain.entity.MenuOption;
import java.util.List;

public interface MenuOptionRepository {

    MenuOption save(MenuOption menuOption);

    List<MenuOption> saveAll(List<MenuOption> menuOptions);

    MenuOption findById(Long id);

    List<MenuOption> findAll();

    List<MenuOption> findAllByMenuIds(List<Long> menuIds);

    List<MenuOption> findAllByMenuId(Long menuId);
}
