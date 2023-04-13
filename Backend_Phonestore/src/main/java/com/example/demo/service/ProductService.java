package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.model.dto.product.DetailProductDTO;
import com.example.demo.model.dto.product.productTrendingDTO;
import com.example.demo.model.dto.productColor.ProductColorDTO;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private SaleRepository saleRepository;

//    public ResponseEntity<Page<ProductEntity>> getProducts(int page)
//    {
//        Pageable pageable= PageRequest.of(page,10, Sort.by("name"));
//        Page<ProductEntity> productPage=repository.findAllByOrderByLastNameAscFirstNameAsc(pageable);
//        return ResponseEntity.ok(productPage);
//
//    }
    public List<ProductEntity> getProducts(){return repository.findAll();}
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
    public ProductEntity updateProduct(int id, ProductEntity product){
        CategoryEntity category=categoryRepository.findById(product.getCategoryEntity().getId()).orElse(null);
        SaleEntity sale=saleRepository.findById(product.getSaleEntity().getId()).orElse(null);
        if(category!=null){
            ProductEntity oldProduct=repository.findById(id).orElse(null);
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
            oldProduct.setStatus(product.getStatus());
            oldProduct.setCategoryEntity(category);
            oldProduct.setSaleEntity(sale);
            return repository.save(oldProduct);
        }
        return null;

    }
//    public List<ProductEntity> getProductByName(String name){
//        return repository.findByName(name);
//    }
    public DetailProductDTO getProductDetail(int productId, int colorId){
        return repository.findByProColId(productId, colorId);
    }
    public List<productTrendingDTO> getProductTreding(){
        return repository.findByTrending();
//        List<ProductColorEntity> productColorEntityList=repo;
//        List<ProductColorDTO> productColorDTOS=new ArrayList<>();
//        for (ProductColorEntity item:productColorEntityList) {
//            ColorEntity color=colorRepository.findById(item.getColorId()).orElse(null);
//            ProductColorDTO productColorDTO= new ProductColorDTO().builder()
//                    .product_ID(item.getProductId())
//                    .color_ID(item.getColorId())
//                    .price(item.getPrice())
//                    .amount(item.getAmount())
//                    .colorName(color.getName())
//                    .build();
//            productColorDTOS.add(productColorDTO);
//        }
    }


}
