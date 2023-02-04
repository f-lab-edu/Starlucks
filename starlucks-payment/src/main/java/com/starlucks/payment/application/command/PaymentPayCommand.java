package com.starlucks.payment.application.command;

public record PaymentPayCommand(long orderId, long amount) {

}
