package com.example.HeinikenProject.dto;

import com.example.HeinikenProject.model.Buyer;
import com.example.HeinikenProject.model.ProductsPurchaseList;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseCreateDto {
    @ManyToOne @NotEmpty
    private Buyer buyerCpf;
    @OneToMany
    private ProductsPurchaseList productsPurchaseList;
}
