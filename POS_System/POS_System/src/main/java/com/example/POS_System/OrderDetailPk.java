package com.example.POS_System;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import java.util.Objects;

@Embeddable
public class OrderDetailPk {

    private long orderId;
    private long productId;

    public OrderDetailPk() {
    }

    public OrderDetailPk(long orderId, long productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailPk that = (OrderDetailPk) o;
        return orderId == that.orderId && productId == that.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }
    @Override
    public String toString() {
        return "OrderDetailPk{" +
                "orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                '}';
    }
}
