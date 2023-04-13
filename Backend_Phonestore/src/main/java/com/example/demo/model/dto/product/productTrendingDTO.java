package com.example.demo.model.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class productTrendingDTO {
    int id;
    String productName;
    String productImage;
    int colorId;
    String colorName;
    Double price;
}
