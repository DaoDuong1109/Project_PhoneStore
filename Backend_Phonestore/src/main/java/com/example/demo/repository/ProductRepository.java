package com.example.demo.repository;

import com.example.demo.entity.ProductColorEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.model.dto.product.DetailProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.dto.product.productTrendingDTO;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
//    @Query("SELECT m FROM Product m WHERE m.name LIKE ?1%")
//    public List<ProductEntity> findByName(String name);

    //find treding
    @Query("SELECT NEW com.example.demo.model.dto.product.productTrendingDTO(p.ID, p.name, p.image,c.id, c.name, pc.price)  " +
            "FROM ProductEntity p join ProductColorEntity pc on p.id=pc.productId " +
            "join SaleEntity s on p.saleEntity.id=s.id " +
            "join ColorEntity c on pc.colorId=c.id " +
            " where p.trending=1")
    List<productTrendingDTO> findByTrending();

    //find by product id and color id
    @Query("SELECT NEW com.example.demo.model.dto.product.DetailProductDTO(p.ID, p.name, p.screen, p.operatingSystem," +
            " p.rearCamera, p.frontCamera, p.cpu,\n" +
            " p.ram, p.insideMemory, p.memoryCard, p.battery, p.image, pc.price, pc.amount, c.name)\n" +
            " FROM ProductEntity p join ProductColorEntity pc on p.id=pc.productId\n" +
            "                            join ColorEntity c on pc.colorId=c.id \n" +
            "where pc.productId=?1 and pc.colorId=?2")
    DetailProductDTO findByProColId(int productId, int colorId);

    //find by category id
    @Query("SELECT p FROM ProductEntity p WHERE categoryEntity.id=?1")
    List<ProductEntity> findByCateId(int category_id);
//    @Query("SELECT m FROM Product m WHERE m.name LIKE ?1%")
//    List<Product> searchByRatingStartsWith(String name);
}
