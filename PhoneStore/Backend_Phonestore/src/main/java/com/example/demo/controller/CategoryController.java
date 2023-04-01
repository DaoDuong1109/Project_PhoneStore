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
    public String createCategory(@RequestBody CategoryEntity category){
        return "";
    }

    @PutMapping("/updateById/{id}")
    public CategoryEntity updateCategory(@PathVariable int id, @RequestBody CategoryEntity category){
        CategoryEntity oldCategory=service.getCategoryById(id);
        if(oldCategory!=null){
            oldCategory.setBrand(category.getBrand());
            oldCategory.setImage(category.getImage());
            service.updateCategory(oldCategory);
        }
        return oldCategory;
    }
    @DeleteMapping ("/deleteById/{id}")
    public String deleteCateById(@PathVariable int id){
        return service.deleteCategory(id);
    }
}
