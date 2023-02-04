package com.starlucks.payment.infrastructure.config;

import com.starlucks.payment.application.processor.PaymentProcessor;
import com.starlucks.payment.application.processor.impl.TossPaymentProcessor;
import com.starlucks.payment.domain.repository.TossPaymentRepository;
import com.starlucks.payment.infrastructure.generator.PaymentIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentProcessor paymentProcessor(TossPaymentRepository paymentRepository) {
        return new TossPaymentProcessor(paymentRepository, new PaymentIdGenerator());
    }
}
