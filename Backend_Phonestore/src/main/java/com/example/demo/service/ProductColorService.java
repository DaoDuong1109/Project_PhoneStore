package com.example.demo.service;

import com.example.demo.entity.ColorEntity;
import com.example.demo.entity.ProductColorEntity;
import com.example.demo.model.dto.productColor.ProductColorDTO;
import com.example.demo.repository.ColorRepository;
import com.example.demo.repository.ProductColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductColorService {
    @Autowired
    private ProductColorRepository repository;
    @Autowired
    private ColorRepository colorRepository;
    public List<ProductColorDTO> productColorFindByProId(int id){
        List<ProductColorEntity> productColorEntityList=repository.findByProductId(id);
        List<ProductColorDTO> productColorDTOS=new ArrayList<>();
        for (ProductColorEntity item:productColorEntityList) {
            ColorEntity color=colorRepository.findById(item.getColorId()).orElse(null);
            ProductColorDTO productColorDTO= new ProductColorDTO().builder()
                    .product_ID(item.getProductId())
                    .color_ID(item.getColorId())
                    .price(item.getPrice())
                    .amount(item.getAmount())
                    .colorName(color.getName())
                    .build();
            productColorDTOS.add(productColorDTO);
        }
        return productColorDTOS;
    }

    public List<ProductColorEntity> updateById(int productId ,List<ProductColorEntity> newLists){
        List<ProductColorEntity> oldLists=repository.findByProductId(productId);//tim danh sach cu theo productid
        for (ProductColorEntity old: oldLists){

            ProductColorEntity newProductColor = newLists.stream()
                    .filter(p -> p.getColorId() == old.getColorId())//loc product color list theo color id ton tai trong list
                    .findFirst()
                    .orElse(null);

            if (newProductColor != null) {
                old.setAmount(newProductColor.getAmount());
                old.setPrice(newProductColor.getPrice());
                repository.save(old); // Cập nhật dữ liệu vào database
            }
        }
            return oldLists;

    }

//    public List<ProductColorDTO> productByName(String name){
//        List<ProductColorDTO> list = repository.findByName(name);
//        return list;
//    }

}
