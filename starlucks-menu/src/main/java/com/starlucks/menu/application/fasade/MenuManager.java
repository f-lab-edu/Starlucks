package com.starlucks.menu.application.fasade;

import com.starlucks.menu.application.command.MenuAddCommand;
import com.starlucks.menu.application.command.MenuInfoCommand;
import com.starlucks.menu.application.processor.MenuAddProcessor;
import com.starlucks.menu.application.processor.MenuInfoProcessor;
import com.starlucks.menu.application.result.MenuInfoResult;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public final class MenuManager {

    private final MenuInfoProcessor menuInfoProcessor;
    private final MenuAddProcessor menuAddProcessor;

    public MenuManager(MenuInfoProcessor menuInfoProcessor, MenuAddProcessor menuAddProcessor) {
        this.menuInfoProcessor = menuInfoProcessor;
        this.menuAddProcessor = menuAddProcessor;
    }

    public List<MenuInfoResult> getMenus() {
        return menuInfoProcessor.execute();
    }

    public MenuInfoResult getMenu(MenuInfoCommand command) {
        return menuInfoProcessor.execute(command.menuId());
    }

    public Long addMenu(MenuAddCommand menuAddCommand) {
        return menuAddProcessor.execute(menuAddCommand);
    }
}
