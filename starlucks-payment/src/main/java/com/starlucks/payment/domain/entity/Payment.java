package com.starlucks.payment.domain.entity;

public abstract class Payment {

    private Long id;
    private Long orderId;
    private long amount;

    protected Payment() {

    }

    public Payment(Long id, Long orderId, long amount) {
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public long getAmount() {
        return amount;
    }
}
