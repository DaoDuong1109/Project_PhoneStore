package com.example.demo.service;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.model.dto.order.OrderByUserDTO;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    public List<OrdersEntity> getOrders(){
        return repository.findAll();
    }
    public OrdersEntity getOrderById(int id){return repository.findById(id).orElse(null);}
    public OrdersEntity addOrder(OrdersEntity order){
        return repository.save(order);
    }

    public List<OrderByUserDTO> findByUser(int userId){
        return repository.getByUser(userId);
    }

}
