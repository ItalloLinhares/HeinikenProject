package com.example.HeinikenProject.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuyerCreateDto {
    @NotEmpty
    private String buyerName;
    @NotEmpty @Digits(integer = 3, fraction = 2)
    private long buyerPromotionSocre;
}
