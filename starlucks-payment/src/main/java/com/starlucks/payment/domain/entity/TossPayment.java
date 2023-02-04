package com.starlucks.payment.domain.entity;

public class TossPayment extends Payment {

    private String tossPaymentId;
    private String version;
    private String paymentKey;
    private String status;
    private String lastTransactionKey;
    private String orderId;
    private String orderName;
    private String requestedAt;
    private String approvedAt;
    private String useEscrow;
    private String cultureExpense;
    private TossPaymentCard card;
    private String virtualAccount;
    private String transfer;
    private String mobilePhone;
    private String giftCertificate;
    private String cashReceipt;
    private String discount;
    private String cancels;
    private String secret;
    private String type;
    private String easyPay;
    private String country;
    private String failure;
    private Boolean isPartialCancelable;
    private String receipt;
    private String checkout;
    private String currency;
    private Long totalAmount;
    private Long balanceAmount;
    private Long suppliedAmount;
    private Long vat;
    private Long taxFreeAmount;
    private String method;

    public static TossPayment from(Long id, Long orderId, Long amount) {
        return new TossPayment();
    }
}
