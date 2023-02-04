package com.starlucks.payment.infrastructure.persistence;

import com.starlucks.payment.domain.entity.TossPayment;
import com.starlucks.payment.domain.repository.TossPaymentRepository;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryTossPaymentRepository implements TossPaymentRepository {

    private final ConcurrentHashMap<Long, TossPayment> map = new ConcurrentHashMap<>();

    @Override
    public TossPayment save(TossPayment tossPayment) {
        map.put(tossPayment.getId(), tossPayment);
        return findById(tossPayment.getId());
    }

    @Override
    public TossPayment findById(Long id) {
        return map.get(id);
    }
}
