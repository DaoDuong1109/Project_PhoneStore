package com.example.demo.controller;

import com.example.demo.entity.SlideEntity;

import com.example.demo.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class SlideController {
    @Autowired
    private SlideService service;

    @GetMapping("/slides")
    public List<SlideEntity> findAllSlides(){
        return service.getSlides();
    }
}
