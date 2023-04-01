package com.example.demo.repository;

import com.example.demo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

    public List<ProductEntity> findByName(String name);
    @Query("SELECT p FROM ProductEntity p WHERE categoryEntity.id=?1")
    List<ProductEntity> findByCateId(int category_id);
//    @Query("SELECT m FROM Product m WHERE m.name LIKE ?1%")
//    List<Product> searchByRatingStartsWith(String name);
}
