package com.example.demo.repository;

import com.example.demo.entity.ProductColorEntity;
import com.example.demo.entity.ProductColorEntityPK;
import com.example.demo.entity.ProductEntity;
import com.example.demo.model.dto.productColor.ProductColorDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ProductColorRepository extends JpaRepository<ProductColorEntity, ProductColorEntityPK> {

    //    @Query("SELECT m FROM Product m WHERE m.name LIKE ?1%")
    @Query("SELECT pc FROM ProductColorEntity pc join ColorEntity c on pc.colorId=c.id where pc.productId=?1")
    List<ProductColorEntity> findByProductId(int id);

}