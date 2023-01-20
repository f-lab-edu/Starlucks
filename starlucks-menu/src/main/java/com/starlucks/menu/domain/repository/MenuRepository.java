package com.starlucks.menu.domain.repository;

import com.starlucks.menu.domain.entity.Menu;
import java.util.List;

public interface MenuRepository {

    Menu save(Menu menu);

    Menu findById(Long id);

    List<Menu> findAll();
}
