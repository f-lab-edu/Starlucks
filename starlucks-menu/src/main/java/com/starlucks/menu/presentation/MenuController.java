package com.starlucks.menu.presentation;

import com.starlucks.common.ApiResponse;
import com.starlucks.menu.application.command.MenuInfoCommand;
import com.starlucks.menu.application.fasade.MenuManager;
import com.starlucks.menu.presentation.request.MenuAddRequest;
import com.starlucks.menu.presentation.response.MenuInfoResponse;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public final class MenuController {

    private final MenuManager menuManager;

    public MenuController(MenuManager menuManager) {
        this.menuManager = menuManager;
    }

    @GetMapping(name = "메뉴 목록 조회")
    public ApiResponse<List<MenuInfoResponse>> getMenus() {
        return ApiResponse.success(
            MenuInfoResponse.from(menuManager.getMenus())
        );
    }

    @GetMapping(path = "/{menuId}", name = "메뉴 조회")
    public ApiResponse<MenuInfoResponse> getMenu(@PathVariable Long menuId) {
        return ApiResponse.success(
            MenuInfoResponse.from(menuManager.getMenu(new MenuInfoCommand(menuId)))
        );
    }

    @PostMapping(name = "메뉴 추가")
    public ApiResponse<Long> addMenu(@RequestBody MenuAddRequest menuAddRequest) {
        return ApiResponse.success(menuManager.addMenu(menuAddRequest.toMenuAddCommand()));
    }
}
