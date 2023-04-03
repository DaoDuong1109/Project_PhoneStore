package com.example.demo.controller;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
//@CrossOrigin(origins = "http://localhost:9090")
public class CategoryController {
    @Autowired
    CategoryService service;

    @GetMapping("/categories")
    public List<CategoryEntity> findALlCate(){
        return service.getCategories();
    }
    @GetMapping("/categoryById/{id}")
    public CategoryEntity findCategoryById(@PathVariable int id){
        return service.getCategoryById(id);
    }
    @PostMapping("/createCategory")
    public CategoryEntity createCategory(@RequestBody CategoryEntity category){
        return service.createCategory(category);
    }

        @PutMapping("/update")
    public CategoryEntity updateCategory(@RequestBody CategoryEntity category){
        return service.updateCategory(category);
    }
    @DeleteMapping ("/deleteById/{id}")
    public String deleteCateById(@PathVariable int id){
        return service.deleteCategory(id);
    }
}
