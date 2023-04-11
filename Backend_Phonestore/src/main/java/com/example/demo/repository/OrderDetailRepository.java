package com.example.demo.repository;

import com.example.demo.entity.OrderDetailEntity;
import com.example.demo.entity.OrderDetailEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, OrderDetailEntityPK> {
}
