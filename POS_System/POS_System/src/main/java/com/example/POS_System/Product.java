package com.example.POS_System;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String productName;
    private Double productPrice;
    private Integer productStock;

    public Product() {
    }

    public Product(String productName, Double productPrice, Integer productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + productId +
                ", name='" + productName + '\'' +
                ", price=" + productPrice +
                ", stock=" + productStock +
                '}';
    }
}
