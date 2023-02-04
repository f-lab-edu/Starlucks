package com.starlucks.payment.application.processor;

import com.starlucks.payment.application.command.PaymentPayCommand;

public interface PaymentProcessor {

    void execute(PaymentPayCommand paymentPayCommand);
}
