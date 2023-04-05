package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class OrderDetailEntityPK implements Serializable {
    @Column(name = "product_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Column(name = "order_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailEntityPK that = (OrderDetailEntityPK) o;
        return Objects.equals(productId, that.productId) && Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, orderId);
    }
}
