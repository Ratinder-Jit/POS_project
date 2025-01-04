package com.example.POS_System.Entity;

import jakarta.persistence.Entity;

@Entity
public class OrderDetailPk {

    private String orderId;
    private String productId;

    public OrderDetailPk() {
    }

    public OrderDetailPk(String orderId, String productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "OrderDetailPk{" +
                "orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                '}';
    }
}
