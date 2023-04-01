package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/product")
@RestController

public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/products")
    public List<ProductEntity> findAllProducts(){
        return service.getProducts();
    }

    @PostMapping("/addProduct")
    public ProductEntity addProduct(@RequestBody ProductEntity product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<ProductEntity> addProducts(@RequestBody List<ProductEntity> products){
        return service.saveAllProducts(products);
    }
    @GetMapping("/productById/{id}")
    public ProductEntity findProductById(@PathVariable int id){
        return service.getProductByID(id);
    }
    @GetMapping("/productByName")
    public List<ProductEntity> findProductByName(@RequestParam("keyword") String keyword){
        return service.getProductByName(keyword);
    }
    @DeleteMapping("/deleteProduct")
    public String deleteProductById(int id){
        return service.deleteProduct(id);
    }
    @PutMapping("/updateProduct")
    public ProductEntity updateProduct(ProductEntity product){
        return service.updateProduct(product);
    }


}
