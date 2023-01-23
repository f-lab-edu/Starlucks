package com.starlucks.menu.infrastructure.config;

import com.starlucks.menu.application.processor.MenuAddProcessor;
import com.starlucks.menu.application.processor.MenuInfoProcessor;
import com.starlucks.menu.domain.repository.MenuOptionRepository;
import com.starlucks.menu.domain.repository.MenuRepository;
import com.starlucks.menu.infrastructure.generator.MenuIdGenerator;
import com.starlucks.menu.infrastructure.generator.MenuOptionIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessConfig {

    @Bean
    public MenuInfoProcessor menuInfoProcessor(
        MenuRepository menuRepository,
        MenuOptionRepository menuOptionRepository
    ) {
        return new MenuInfoProcessor(menuRepository, menuOptionRepository);
    }

    @Bean
    public MenuAddProcessor menuAddProcessor(
        MenuRepository menuRepository,
        MenuOptionRepository menuOptionRepository
    ) {
        return new MenuAddProcessor(
            menuRepository,
            menuOptionRepository,
            new MenuIdGenerator(),
            new MenuOptionIdGenerator()
        );
    }
}
