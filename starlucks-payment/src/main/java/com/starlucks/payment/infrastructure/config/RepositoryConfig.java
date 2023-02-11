package com.starlucks.payment.infrastructure.config;

import com.starlucks.payment.infrastructure.persistence.InMemoryPaymentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RepositoryConfig {

    @Bean
    public InMemoryPaymentRepository inMemoryMenuRepository() {
        return new InMemoryPaymentRepository();
    }
}
