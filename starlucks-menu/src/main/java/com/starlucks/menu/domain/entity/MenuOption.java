package com.starlucks.menu.domain.entity;

import com.starlucks.common.Codes.OptionCategory;
import com.starlucks.menu.application.command.MenuOptionAddCommand;

public final class MenuOption {

    private String name;
    private OptionCategory optionCategory;
    private String defaultOption;

    public static MenuOption from(MenuOptionAddCommand command) {
        return new MenuOption(command.name(), command.optionCategory(), command.defaultOption());
    }

    public MenuOption(String name, OptionCategory optionCategory, String defaultOption) {
        this.name = name;
        this.optionCategory = optionCategory;
        this.defaultOption = defaultOption;
    }

    public String getName() {
        return name;
    }

    public OptionCategory getOptionCategory() {
        return optionCategory;
    }

    public String getDefaultOption() {
        return defaultOption;
    }
}
