package com.example.HeinikenProject.dto;

import com.example.HeinikenProject.model.ProductsCrate;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsPurchaseListDto {
    @NotNull
    public ProductsCrate productsCrate;
    @Min(1) @Max(100)
    private int productsPurchaseQuantity;
}
