package com.example.POS_System;

import com.example.POS_System.OrderDetailPk;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class OrderDetail {

    @Id
    private OrderDetailPk orderDetailPk;

    private int quantity;

    private BigDecimal price = BigDecimal.ZERO;

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId", insertable = false, updatable = false) // Reference the orderId from Order
    private Order order;

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "productId", insertable = false, updatable = false) // Reference the productId from Product
    private Product product;
    public OrderDetail() {
    }
    public OrderDetail(OrderDetailPk orderDetailPK, int qty, BigDecimal unitPrice) {
        this.setOrderDetailPk(orderDetailPK);
        this.setQuantity(qty);
        this.setPrice(unitPrice);
    }

    public OrderDetail(long orderId, long productId, int qty, BigDecimal unitPrice) {
        this.setOrderDetailPk(new OrderDetailPk(orderId,productId));
        this.setQuantity(qty);
        this.setPrice(unitPrice);
    }

//    public OrderDetail(int quantity, BigDecimal price, Order order) {
//        this.quantity = quantity;
//        this.price = price;
//        this.order = order;
//    }

    public OrderDetailPk getOrderDetailPk() {
        return orderDetailPk;
    }

    public void setOrderDetailPk(OrderDetailPk orderDetailPk) {
        this.orderDetailPk = orderDetailPk;
    }
    //    public long getOrderDetailId() {
//        return orderDetailId;
//    }
//
//    public void setOrderDetailId(long orderDetailId) {
//        this.orderDetailId = orderDetailId;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailId=" + orderDetailPk +
                ", quantity=" + quantity +
                ", price=" + price +
                ", order=" + order +
                ", product=" + product +
                '}';
    }
}
