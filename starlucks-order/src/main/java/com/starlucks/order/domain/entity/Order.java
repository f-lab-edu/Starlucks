package com.starlucks.order.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long storeId;
    private Long userId;
    private Long paymentId;
    private Long totalPrice;
    private String status;
    @Column(insertable = false, updatable = false)
    private LocalDateTime createDtm;
    @Column(insertable = false, updatable = false)
    private LocalDateTime updateDtm;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<OrderLineItem> orderLineItems = List.of();

    public Long getId() {
        return id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreateDtm() {
        return createDtm;
    }

    public LocalDateTime getUpdateDtm() {
        return updateDtm;
    }

    public List<OrderLineItem> getOrderLineItems() {
        return orderLineItems;
    }
}
