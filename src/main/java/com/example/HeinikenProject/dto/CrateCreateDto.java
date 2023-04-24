package com.example.HeinikenProject.dto;

import com.example.HeinikenProject.model.Products;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrateCreateDto {
    private Products products;
    @Min(0)
    private int productQuantity;
}
