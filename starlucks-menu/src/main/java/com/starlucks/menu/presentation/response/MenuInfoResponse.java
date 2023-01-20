package com.starlucks.menu.presentation.response;

import com.starlucks.menu.application.processor.MenuInfoProcessor;
import java.util.ArrayList;
import java.util.List;

public final class MenuInfoResponse {

    private final long menuId;
    private final String menuName;

    public static List<MenuInfoResponse> from(List<MenuInfoProcessor.Result> results) {
        List<MenuInfoResponse> menuInfoResponses = new ArrayList<>();

        for (MenuInfoProcessor.Result result : results) {
            menuInfoResponses.add(new MenuInfoResponse(result.getMenuId(), result.getMenuName()));
        }

        return menuInfoResponses;
    }

    public static MenuInfoResponse from(MenuInfoProcessor.Result result) {
        return new MenuInfoResponse(
            result.getMenuId(),
            result.getMenuName()
        );
    }

    public MenuInfoResponse(long menuId, String menuName) {
        this.menuId = menuId;
        this.menuName = menuName;
    }

    public long getMenuId() {
        return menuId;
    }

    public String getMenuName() {
        return menuName;
    }
}
