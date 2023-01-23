package com.starlucks.menu.presentation.request;

import com.starlucks.common.Codes.Size;
import com.starlucks.menu.application.command.MenuAddCommand;
import com.starlucks.menu.application.command.MenuOptionAddCommand;
import java.util.List;

public class MenuAddRequest {

    private String name;
    private long price;
    private Size size;
    private List<MenuOptionRequest> menuOptionRequests;

    public MenuAddCommand toMenuAddCommand() {
        List<MenuOptionAddCommand> menuOptionAddCommands = menuOptionRequests.stream()
            .map(menuOptionRequest ->
                new MenuOptionAddCommand(
                    menuOptionRequest.getName(),
                    menuOptionRequest.getOptionCategory(),
                    menuOptionRequest.getDefaultOption()
                )
            ).toList();

        return new MenuAddCommand(name, price, size, menuOptionAddCommands);
    }

    public MenuAddRequest() {
    }

    public MenuAddRequest(String name, long price, Size size,
        List<MenuOptionRequest> menuOptionRequests) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.menuOptionRequests = menuOptionRequests;
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

    public List<MenuOptionRequest> getMenuOptionRequests() {
        return menuOptionRequests;
    }
}
