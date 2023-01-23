package com.starlucks.menu.domain.entity;

import com.starlucks.common.Codes.OptionCategory;

public final class MenuOption {

    private final Long id;
    private final Long menuId;
    private String name;
    private OptionCategory optionCategory;
    private String defaultOption;

    public static MenuOption from(
        long id,
        Long menuId,
        String name,
        OptionCategory optionCategory,
        String defaultOption
    ) {
        return new MenuOption(id, menuId, name, optionCategory, defaultOption);
    }

    public MenuOption(Long id, Long menuId, String name, OptionCategory optionCategory,
        String defaultOption) {
        this.id = id;
        this.menuId = menuId;
        this.name = name;
        this.optionCategory = optionCategory;
        this.defaultOption = defaultOption;
    }

    public Long getId() {
        return id;
    }

    public Long getMenuId() {
        return menuId;
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
