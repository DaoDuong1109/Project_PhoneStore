package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sale", schema = "phone_store", catalog = "")
public class SaleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "from_date")
    private Timestamp fromDate;
    @Basic
    @Column(name = "to_date")
    private Timestamp toDate;
    @Basic
    @Column(name = "status")
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    public Timestamp getToDate() {
        return toDate;
    }

    public void setToDate(Timestamp toDate) {
        this.toDate = toDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleEntity that = (SaleEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(fromDate, that.fromDate) && Objects.equals(toDate, that.toDate) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fromDate, toDate, status);
    }
}
