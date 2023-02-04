package com.starlucks.payment.application.processor.impl;

import com.starlucks.payment.application.command.PaymentPayCommand;
import com.starlucks.payment.application.processor.PaymentProcessor;
import com.starlucks.payment.domain.entity.TossPayment;
import com.starlucks.payment.domain.repository.TossPaymentRepository;
import com.starlucks.payment.infrastructure.generator.PaymentIdGenerator;

public final class TossPaymentProcessor implements PaymentProcessor {


    private final TossPaymentRepository tossPaymentRepository;
    private final PaymentIdGenerator idGenerator;

    public TossPaymentProcessor(
        TossPaymentRepository tossPaymentRepository,
        PaymentIdGenerator paymentIdGenerator
    ) {
        this.tossPaymentRepository = tossPaymentRepository;
        this.idGenerator = paymentIdGenerator;
    }

    @Override
    public void execute(PaymentPayCommand paymentPayCommand) {
        tossPaymentRepository.save(
            TossPayment.from(idGenerator.generate(), paymentPayCommand.orderId(),
                paymentPayCommand.amount())
        );
    }
}
