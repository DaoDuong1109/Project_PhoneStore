package com.example.demo.controller;

import com.example.demo.entity.CommentEntity;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/comment")
@RestController
public class CommentController {
    @Autowired
    private CommentService service;
    @GetMapping("/findAll")
    public List<CommentEntity> findAll(){return service.getAll();}
    @GetMapping("/findById/{id}")
    public CommentEntity findById(@PathVariable int id){return service.getById(id);}
    @DeleteMapping("/deleteById/{id}")
    public String deleteComment(@PathVariable int id){
        return service.deleleById(id);
    }
}
