package com.starlucks.menu.infrastructure.config;

import com.starlucks.menu.application.processor.MenuAddProcessor;
import com.starlucks.menu.application.processor.MenuInfoProcessor;
import com.starlucks.menu.domain.repository.MenuRepository;
import com.starlucks.menu.infrastructure.generator.MenuIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessConfig {

    @Bean
    public MenuInfoProcessor menuInfoProcessor(MenuRepository menuRepository) {
        return new MenuInfoProcessor(menuRepository);
    }

    @Bean
    public MenuAddProcessor menuAddProcessor(MenuRepository menuRepository) {
        return new MenuAddProcessor(
            menuRepository,
            new MenuIdGenerator()
        );
    }

}
