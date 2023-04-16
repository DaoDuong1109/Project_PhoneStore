package com.example.demo.model.dto.product;

import com.example.demo.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductTrendingDTO {
    int id;
    String productName;
    String productImage;
    int colorId;
    String colorName;
    Double price;
    CategoryEntity category;
}
