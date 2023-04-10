package com.example.demo.model.dto.productColor;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class ProductColorDTO {
    private int product_ID;
    private int color_ID;
    private Double price;
    private int amount;
    private  String colorName;
}
