package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "phone_store", catalog = "")
public class OrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Basic
    @Column(name = "status")
    private Boolean status;
    @Basic
    @ManyToOne
    @JoinColumn(name = "user_ID")
    private UserEntity userEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(address, that.address) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(createdDate, that.createdDate) && Objects.equals(status, that.status) && Objects.equals(userEntity, that.userEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, phone, email, createdDate, status, userEntity);
    }
}
