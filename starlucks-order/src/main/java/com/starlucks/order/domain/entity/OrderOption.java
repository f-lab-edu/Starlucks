package com.starlucks.order.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_option")
public class OrderOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderOptionGroupId;
    private String name;
    private Long price;
    @Column(insertable = false, updatable = false)
    private LocalDateTime createDtm;
    @Column(insertable = false, updatable = false)
    private LocalDateTime updateDtm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderOptionGroupId", insertable = false, updatable = false)
    private OrderOptionGroup orderOptionGroup;

    public Long getId() {
        return id;
    }

    public Long getOrderOptionGroupId() {
        return orderOptionGroupId;
    }

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public LocalDateTime getCreateDtm() {
        return createDtm;
    }

    public LocalDateTime getUpdateDtm() {
        return updateDtm;
    }

    public OrderOptionGroup getOrderOptionGroup() {
        return orderOptionGroup;
    }
}
