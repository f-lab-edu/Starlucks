package com.starlucks.menu.application.processor;

import com.starlucks.menu.domain.entity.Menu;
import com.starlucks.menu.domain.repository.MenuRepository;
import java.util.ArrayList;
import java.util.List;

public class MenuInfoProcessor {

    private final MenuRepository menuRepository;

    public MenuInfoProcessor(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Result> execute() {
        List<Menu> menus = menuRepository.findAll();

        List<Result> results = new ArrayList<>();

        for (Menu menu : menus) {
            results.add(Result.from(menu));
        }

        return results;
    }

    public Result execute(Long menuId) {
        Menu menu = menuRepository.findById(menuId);

        return Result.from(menu);
    }

    public static class Command {
        private final Long menuId;

        public Command(Long menuId) {
            this.menuId = menuId;
        }

        public Long getMenuId() {
            return menuId;
        }
    }

    public static class Result {

        private final long menuId;
        private final String menuName;
        private final long price;

        public static Result from(Menu menu) {
            return new Result(menu.getId(), menu.getName(), menu.getPrice());
        }

        public Result(long menuId, String menuName, long price) {
            this.menuId = menuId;
            this.menuName = menuName;
            this.price = price;
        }

        public long getMenuId() {
            return menuId;
        }

        public String getMenuName() {
            return menuName;
        }

        public long getPrice() {
            return price;
        }
    }
}
