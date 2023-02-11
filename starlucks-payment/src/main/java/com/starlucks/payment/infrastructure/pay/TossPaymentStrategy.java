package com.starlucks.payment.infrastructure.pay;

public class TossPaymentStrategy implements PaymentStrategy {

    @Override
    public String pay() {
        return "toss_response_1";
    }
}
