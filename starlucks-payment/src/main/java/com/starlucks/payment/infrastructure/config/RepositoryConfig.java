package com.starlucks.payment.infrastructure.config;

import com.starlucks.payment.infrastructure.persistence.InMemoryTossPaymentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RepositoryConfig {

    @Bean
    public InMemoryTossPaymentRepository inMemoryMenuRepository() {
        return new InMemoryTossPaymentRepository();
    }
}
