package com.starlucks.menu.presentation.response;

import com.starlucks.common.Codes.OptionCategory;
import com.starlucks.menu.application.result.MenuOptionInfoResult;

public record MenuOptionInfoResponse(
    String name,
    OptionCategory optionCategory,
    String defaultOption
) {

    public static MenuOptionInfoResponse from(MenuOptionInfoResult result) {
        return new MenuOptionInfoResponse(
            result.name(),
            result.optionCategory(),
            result.defaultOption()
        );
    }
}
