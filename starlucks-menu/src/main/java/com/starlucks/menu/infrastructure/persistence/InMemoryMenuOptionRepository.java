package com.starlucks.menu.infrastructure.persistence;

import com.starlucks.menu.domain.entity.MenuOption;
import com.starlucks.menu.domain.repository.MenuOptionRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryMenuOptionRepository implements MenuOptionRepository {

    private final ConcurrentHashMap<Long, MenuOption> map = new ConcurrentHashMap<>();

    @Override
    public MenuOption save(MenuOption menuOption) {
        map.put(menuOption.getId(), menuOption);
        return findById(menuOption.getId());
    }

    @Override
    public List<MenuOption> saveAll(List<MenuOption> menuOptions) {
        return menuOptions.stream().map(menuOption ->
            map.put(menuOption.getId(), menuOption)
        ).toList();
    }

    @Override
    public MenuOption findById(Long id) {
        return map.get(id);
    }

    @Override
    public List<MenuOption> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public List<MenuOption> findAllByMenuIds(List<Long> menuIds) {
        return map.values().stream().filter(e -> menuIds.contains(e.getMenuId())).toList();
    }

    @Override
    public List<MenuOption> findAllByMenuId(Long menuId) {
        return map.values().stream().filter(e -> menuId.equals(e.getMenuId())).toList();
    }
}
