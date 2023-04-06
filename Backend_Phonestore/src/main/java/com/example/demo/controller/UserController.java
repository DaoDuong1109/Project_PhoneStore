package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/findAll")
    public List<UserEntity> findAll(){return service.getUsers();}
    @GetMapping("/findById/{id}")
    public UserEntity findById(@PathVariable int id){
        return service.getById(id);
    }
    @DeleteMapping("/deleteUser/{id}")
    public String deleteSlideById(@PathVariable int id){
        return service.delete(id);
    }
}
