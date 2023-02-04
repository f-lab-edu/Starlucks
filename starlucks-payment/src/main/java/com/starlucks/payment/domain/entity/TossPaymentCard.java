package com.starlucks.payment.domain.entity;

public class TossPaymentCard {
    String issuerCode;
    String acquirerCode;
    String number;
    int installmentPlanMonths;
    Boolean isInterestFree;
    String interestPayer;
    String approveNo;
    Boolean useCardPoint;
    String cardType;
    String ownerType;
    String acquireStatus;
    Long amount;
}
