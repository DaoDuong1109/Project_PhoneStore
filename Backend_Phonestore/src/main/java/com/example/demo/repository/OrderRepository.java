package com.example.demo.repository;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.model.dto.order.OrderByUserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrdersEntity, Integer> {
    @Query("select new com.example.demo.model.dto.order.OrderByUserDTO(od.orderId, o.createdDate, " +
            "sum(od.amount*od.price), o.status) " +
            " from OrdersEntity o join OrderDetailEntity od on o.id=od.orderId " +
            " where o.userEntity.id=?1 " +
            " group by od.orderId")
    List<OrderByUserDTO> getByUser(int id);
}
