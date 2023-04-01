package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<ProductEntity> getProducts(){
        return repository.findAll();
    }
    public ProductEntity saveProduct(ProductEntity product){
        return repository.save(product);
    }
    public List<ProductEntity> saveAllProducts(List<ProductEntity> products){
        return repository.saveAll(products);
    }
    public ProductEntity getProductByID(int id){
        return repository.findById(id).orElse(null);
    }
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product is removed: "+id;
    }
    public ProductEntity updateProduct(ProductEntity product){
        ProductEntity oldProduct=repository.findById(product.getId()).orElse(null);
        oldProduct.setName(product.getName());
        oldProduct.setImage(product.getImage());
        oldProduct.setScreen(product.getScreen());
        oldProduct.setOperatingSystem(product.getOperatingSystem());
        oldProduct.setFrontCamera(product.getFrontCamera());
        oldProduct.setRearCamera(product.getRearCamera());
        oldProduct.setCpu(product.getCpu());
        oldProduct.setRam(product.getRam());
        oldProduct.setInsideMemory(product.getInsideMemory());
        oldProduct.setMemoryCard(product.getMemoryCard());
        oldProduct.setBattery(product.getBattery());
        oldProduct.setTrending(product.getTrending());
        oldProduct.setCategoryId(product.getCategoryEntity().getId());
        return repository.save(oldProduct);
    }
    public List<ProductEntity> getProductByName(String name){
        return repository.findByName(name);
    }


}
