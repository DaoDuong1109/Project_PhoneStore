package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "order_detail", schema = "phone_store", catalog = "")
@IdClass(OrderDetailEntityPK.class)
public class OrderDetailEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "productId")
    private Integer productId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "orderId")
    private Integer orderId;
    @Basic
    @Column(name = "price")
    private Double price;
    @Basic
    @Column(name = "amount")
    private Integer amount;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailEntity that = (OrderDetailEntity) o;
        return Objects.equals(productId, that.productId) && Objects.equals(orderId, that.orderId) && Objects.equals(price, that.price) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, orderId, price, amount);
    }
}
