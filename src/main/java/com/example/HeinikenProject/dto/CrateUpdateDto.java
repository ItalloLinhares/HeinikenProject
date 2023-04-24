package com.example.HeinikenProject.dto;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrateUpdateDto {
    @Min(0)
    private int productQuantity;
}
