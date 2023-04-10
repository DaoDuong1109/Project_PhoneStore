package com.example.demo.service;

import com.example.demo.entity.CommentEntity;
import com.example.demo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repository;
    public List<CommentEntity> getAll(){return repository.findAll();}
    public CommentEntity getById(int id){return repository.findById(id).orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND,"Not Found Comment"));}
    public String deleleById(int id){
        repository.deleteById(id);
        return "Successful";
    }
}
