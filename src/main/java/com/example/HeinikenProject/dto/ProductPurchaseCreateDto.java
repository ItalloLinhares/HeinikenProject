package com.example.HeinikenProject.dto;

import com.example.HeinikenProject.model.ProductsCrate;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPurchaseCreateDto {
    @NotNull
    private ProductsCrate productsCrate;
    @Min(1) @Max(100)
    private int productsPurchaseQuantity;
}
