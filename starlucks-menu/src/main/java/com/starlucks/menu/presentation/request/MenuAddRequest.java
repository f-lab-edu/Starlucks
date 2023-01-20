package com.starlucks.menu.presentation.request;

import com.starlucks.menu.application.processor.MenuAddProcessor;

public class MenuAddRequest {

    private String name;
    private long price;

    public MenuAddProcessor.Command toCommand() {
        return new MenuAddProcessor.Command(name, price);
    }

    public MenuAddRequest() {
    }

    public MenuAddRequest(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }
}
