package com.starlucks.payment.presentation.request;

import com.starlucks.payment.application.command.PaymentPayCommand;
import jakarta.validation.constraints.NotNull;

public class PaymentPayRequest {

    @NotNull
    private long orderId;
    @NotNull
    private long amount;

    protected PaymentPayRequest() {
    }

    public long getOrderId() {
        return orderId;
    }

    public long getAmount() {
        return amount;
    }

    public PaymentPayCommand toCommand() {
        return new PaymentPayCommand(orderId, amount);
    }
}
