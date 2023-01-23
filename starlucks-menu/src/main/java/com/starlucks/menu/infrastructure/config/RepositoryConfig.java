package com.starlucks.menu.infrastructure.config;

import com.starlucks.menu.infrastructure.persistence.InMemoryMenuOptionRepository;
import com.starlucks.menu.infrastructure.persistence.InMemoryMenuRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RepositoryConfig {
    @Bean
    public InMemoryMenuRepository inMemoryMenuRepository() {
        return new InMemoryMenuRepository();
    }

    @Bean
    public InMemoryMenuOptionRepository inMemoryMenuOptionRepository() {
        return new InMemoryMenuOptionRepository();
    }
}
