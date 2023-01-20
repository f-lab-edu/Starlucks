package com.starlucks.menu.infrastructure.persistence;

import com.starlucks.menu.domain.entity.Menu;
import com.starlucks.menu.domain.repository.MenuRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryMenuRepository implements MenuRepository {
    private final ConcurrentHashMap<Long, Menu> map = new ConcurrentHashMap<>();

    @Override
    public Menu save(Menu menu) {
        map.put(menu.getId(), menu);
        return menu;
    }

    @Override
    public Menu findById(Long id) {
        return map.get(id);
    }

    @Override
    public List<Menu> findAll() {
        List<Menu> menus = new ArrayList<>();

        for (Map.Entry<Long, Menu> mapEntry : map.entrySet()) {
            menus.add(mapEntry.getValue());
        }

        return menus;
    }
}
