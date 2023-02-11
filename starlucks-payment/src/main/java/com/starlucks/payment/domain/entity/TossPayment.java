package com.starlucks.payment.domain.entity;

import com.starlucks.payment.application.command.PaymentPayCommand;

public class TossPayment extends Payment {

    private final String tossPaymentId;

    public TossPayment(Long id, Long orderId, long amount, String tossPaymentId) {
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
        this.tossPaymentId = tossPaymentId;
    }

    public static TossPayment from(Long id, PaymentPayCommand command, String tossPaymentId) {
        return new TossPayment(id, command.orderId(), command.amount(), tossPaymentId);
    }

    public String getTossPaymentId() {
        return tossPaymentId;
    }
}
