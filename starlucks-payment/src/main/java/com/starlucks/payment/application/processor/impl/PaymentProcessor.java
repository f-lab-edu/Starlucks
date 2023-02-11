package com.starlucks.payment.application.processor.impl;

import com.starlucks.payment.application.command.PaymentPayCommand;
import com.starlucks.payment.domain.entity.TossPayment;
import com.starlucks.payment.domain.repository.PaymentRepository;
import com.starlucks.payment.infrastructure.generator.PaymentIdGenerator;
import com.starlucks.payment.infrastructure.pay.PaymentStrategy;

public class PaymentProcessor {

    private final PaymentRepository paymentRepository;
    private final PaymentIdGenerator idGenerator;

    public PaymentProcessor(PaymentRepository paymentRepository,
        PaymentIdGenerator idGenerator) {
        this.paymentRepository = paymentRepository;
        this.idGenerator = idGenerator;
    }

    public void execute(PaymentStrategy paymentStrategy, PaymentPayCommand paymentPayCommand) {

        var tossPaymentId = paymentStrategy.pay();

        paymentRepository.save(
            TossPayment.from(idGenerator.generate(), paymentPayCommand, tossPaymentId)
        );
    }
}
