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

    @ManyToOne
    @JoinColumn(name = "customerId",referencedColumnName = "customerId", nullable = false)
    private Customer customer;

    @OneToMany
    private List<OrderDetail> orderDetails;

//    private BigDecimal totalAmount = BigDecimal.ZERO;



    public Order() {
    }

    public Order(LocalDate orderDate, Customer customer) {
        this.orderDate = orderDate;
        this.customer = customer;
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

//    public BigDecimal getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setTotalAmount(BigDecimal totalAmount) {
//        this.totalAmount = totalAmount;
//    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        for (OrderDetail orderDetail : orderDetails) {
            orderDetail.setOrder(this);
        }
        this.orderDetails = orderDetails;
    }

    public void addOrderDetail(OrderDetail orderDetail){
        orderDetail.setOrder(this);
        this.getOrderDetails().add(orderDetail);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", customer=" + customer +
                ", orderDetails=" + orderDetails +
                '}';
    }
}

