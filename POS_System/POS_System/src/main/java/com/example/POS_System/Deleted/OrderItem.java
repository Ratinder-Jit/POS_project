//package com.example.POS_System;
//
//import jakarta.persistence.*;
//
//@Entity
//public class OrderItem {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long orderItemId;
//
//    private int quantity;
//    private double price;
//
//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private Order order;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Product product;
//
//
//    public OrderItem() {
//    }
//
//    public OrderItem(int quantity, double price, Order order, Product product) {
//        this.quantity = quantity;
//        this.price = price;
//        this.order = order;
//        this.product = product;
//    }
//
//    public long getOrderItemId() {
//        return orderItemId;
//    }
//
//    public void setOrderItemId(long orderItemId) {
//        this.orderItemId = orderItemId;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    @Override
//    public String toString() {
//        return "OrderItem{" +
//                "orderItemId=" + orderItemId +
//                ", quantity=" + quantity +
//                ", price=" + price +
//                ", order=" + order +
//                ", product=" + product +
//                '}';
//    }
//}
