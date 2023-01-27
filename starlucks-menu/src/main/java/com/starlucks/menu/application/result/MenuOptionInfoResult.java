package com.starlucks.menu.application.result;

import com.starlucks.common.Codes.OptionCategory;
import com.starlucks.menu.domain.entity.MenuOption;

public record MenuOptionInfoResult(
    String name, OptionCategory optionCategory, String defaultOption
) {

    public static MenuOptionInfoResult from(MenuOption menuOption) {
        return new MenuOptionInfoResult(
            menuOption.getName(),
            menuOption.getOptionCategory(),
            menuOption.getDefaultOption()
        );
    }
}
