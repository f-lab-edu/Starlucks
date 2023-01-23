package com.starlucks.menu.application.result;

import com.starlucks.common.Codes.Size;
import com.starlucks.menu.domain.entity.Menu;
import com.starlucks.menu.domain.entity.MenuOption;
import java.util.List;

public record MenuInfoResult(
    long menuId,
    String menuName,
    long price, Size size,
    List<MenuOptionInfoResult> menuOptionInfoResults
) {

    public static MenuInfoResult from(Menu menu, List<MenuOption> menuOptions) {
        return new MenuInfoResult(
            menu.getId(), menu.getName(), menu.getPrice(), menu.getSize(),
            menuOptions.stream().map(MenuOptionInfoResult::from).toList()
        );
    }
}
