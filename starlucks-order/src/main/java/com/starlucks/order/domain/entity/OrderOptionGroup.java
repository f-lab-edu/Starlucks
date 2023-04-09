package com.starlucks.order.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "order_option_group")
public class OrderOptionGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderLineItemId;
    private String name;
    @Column(insertable = false, updatable = false)
    private LocalDateTime createDtm;
    @Column(insertable = false, updatable = false)
    private LocalDateTime updateDtm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderLineItemId", insertable = false, updatable = false)
    private OrderLineItem orderLineItem;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderOptionGroup")
    private List<OrderOption> orderOptions = List.of();

    public Long getId() {
        return id;
    }

    public Long getOrderLineItemId() {
        return orderLineItemId;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreateDtm() {
        return createDtm;
    }

    public LocalDateTime getUpdateDtm() {
        return updateDtm;
    }

    public OrderLineItem getOrderLineItem() {
        return orderLineItem;
    }

    public List<OrderOption> getOrderOptions() {
        return orderOptions;
    }
}
