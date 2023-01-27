package com.starlucks.menu.application.result;

import com.starlucks.common.Codes.Size;
import com.starlucks.menu.domain.entity.Menu;
import java.util.List;

public record MenuInfoResult(
    long menuId,
    String menuName,
    long price, Size size,
    List<MenuOptionInfoResult> menuOptionInfoResults
) {

    public static MenuInfoResult from(Menu menu) {
        return new MenuInfoResult(
            menu.getId(), menu.getName(), menu.getPrice(), menu.getSize(),
            menu.getMenuOptions().stream().map(MenuOptionInfoResult::from).toList()
        );
    }
}
