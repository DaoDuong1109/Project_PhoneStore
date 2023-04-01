package com.example.demo.service;

import com.example.demo.entity.SlideEntity;
import com.example.demo.repository.SlideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlideService {
    @Autowired
    private SlideRepository repository;
    public List<SlideEntity> getSlides(){
        return repository.findAll();
    }
}
