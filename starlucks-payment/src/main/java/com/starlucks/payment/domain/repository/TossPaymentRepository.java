package com.starlucks.payment.domain.repository;

import com.starlucks.payment.domain.entity.TossPayment;

public interface TossPaymentRepository {

    TossPayment save(TossPayment tossPayment);

    TossPayment findById(Long id);
}
