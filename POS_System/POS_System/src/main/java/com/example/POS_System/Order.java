package com.example.POS_System;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    private LocalDate orderDate;

//    @ManyToOne
//    @JoinColumn(name = "customerId",referencedColumnName = "customerId", nullable = false)
//    private Customer customer;
//
//    @OneToMany
//    private List<OrderDetail> orderDetails

    private BigDecimal totalAmount = BigDecimal.ZERO;



    public Order() {
    }

    public Order(LocalDate orderDate, BigDecimal totalAmount) {
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

