package com.starlucks.menu.presentation.request;

import com.starlucks.common.Codes.OptionCategory;

public class MenuOptionRequest {

    private String name;
    private OptionCategory optionCategory;
    private String defaultOption;

    public MenuOptionRequest() {}

    public MenuOptionRequest(String name, OptionCategory optionCategory, String defaultOption) {
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
