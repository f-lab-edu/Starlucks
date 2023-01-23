package com.starlucks.menu.presentation.response;

import com.starlucks.common.Codes.Size;
import com.starlucks.menu.application.result.MenuInfoResult;
import java.util.List;

public record MenuInfoResponse(
    long menuId,
    String menuName,
    long price,
    Size size,
    List<MenuOptionInfoResponse> menuOptionInfoResponse
) {

    public static List<MenuInfoResponse> from(List<MenuInfoResult> results) {
        return results.stream().map(MenuInfoResponse::from).toList();
    }

    public static MenuInfoResponse from(MenuInfoResult menuInfoResult) {
        return new MenuInfoResponse(
            menuInfoResult.menuId(),
            menuInfoResult.menuName(),
            menuInfoResult.price(),
            menuInfoResult.size(),
            menuInfoResult.menuOptionInfoResults().stream()
                .map(MenuOptionInfoResponse::from)
                .toList()
        );
    }
}
