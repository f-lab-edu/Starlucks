package com.starlucks.menu.application.command;

import com.starlucks.common.Codes.OptionCategory;

public record MenuOptionAddCommand(
    String name,
    OptionCategory optionCategory,
    String defaultOption
) {

}
