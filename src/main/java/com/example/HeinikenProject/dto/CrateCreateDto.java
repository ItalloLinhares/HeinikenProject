package com.example.HeinikenProject.dto;

import com.example.HeinikenProject.model.ProductsCrate;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrateCreateDto {
    private ProductsCrate productsCrate;
    @Min(0)
    private int productQuantity;
}
