package com.starlucks.menu.domain.entity;

import com.starlucks.common.Codes.Size;
import com.starlucks.menu.application.command.MenuAddCommand;
import java.util.List;

public final class Menu {

    private final Long id;
    private String name;
    private long price;
    private Size size;
    private List<MenuOption> menuOptions;

    public static Menu from(long id, MenuAddCommand command) {
        return new Menu(id, command.menuName(), command.menuPrice(), command.size(),
            command.menuOptionAddCommands().stream().map(MenuOption::from).toList()
        );
    }

    public Menu(Long id, String name, long price, Size size, List<MenuOption> menuOptions) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.menuOptions = menuOptions;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    public List<MenuOption> getMenuOptions() {
        return menuOptions;
    }
}
