package com.example.HeinikenProject.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NotEmpty
public class BuyerUpdateDto {
    @NotEmpty
    @Digits(integer = 3, fraction = 2)
    private long buyerPromotionSocre;
}
