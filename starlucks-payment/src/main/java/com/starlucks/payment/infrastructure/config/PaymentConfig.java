package com.starlucks.payment.infrastructure.config;

import com.starlucks.payment.application.processor.impl.PaymentProcessor;
import com.starlucks.payment.domain.repository.PaymentRepository;
import com.starlucks.payment.infrastructure.generator.PaymentIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentProcessor paymentProcessor(PaymentRepository paymentRepository) {
        return new PaymentProcessor(paymentRepository, new PaymentIdGenerator());
    }
}
