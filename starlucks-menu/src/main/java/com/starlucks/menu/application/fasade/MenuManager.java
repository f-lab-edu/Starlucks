package com.starlucks.menu.application.fasade;

import com.starlucks.menu.application.processor.MenuAddProcessor;
import com.starlucks.menu.application.processor.MenuInfoProcessor;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MenuManager {

    private final MenuInfoProcessor menuInfoProcessor;
    private final MenuAddProcessor menuAddProcessor;

    public MenuManager(MenuInfoProcessor menuInfoProcessor, MenuAddProcessor menuAddProcessor) {
        this.menuInfoProcessor = menuInfoProcessor;
        this.menuAddProcessor = menuAddProcessor;
    }

    public List<MenuInfoProcessor.Result> getMenus() {
        return menuInfoProcessor.execute();
    }

    public MenuInfoProcessor.Result getMenu(MenuInfoProcessor.Command command) {
        return menuInfoProcessor.execute(command.getMenuId());
    }

    public Long addMenu(MenuAddProcessor.Command command) {
        return menuAddProcessor.execute(command);
    }
}
