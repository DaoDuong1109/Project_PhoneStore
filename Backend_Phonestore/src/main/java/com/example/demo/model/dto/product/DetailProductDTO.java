package com.example.demo.model.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DetailProductDTO {
    private int id;
    private String productName;
    private String screen;
    private String system;
    private String rearCamera;
    private String frontCamera;
    private String cpu;
    private String ram;
    private String inside;
    private String outside;
    private String battery;
    private String image;
    private Double price;
    private Integer amount;
    private String colorName;
}
