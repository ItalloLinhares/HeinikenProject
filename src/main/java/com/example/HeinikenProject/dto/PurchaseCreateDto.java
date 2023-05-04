package com.example.HeinikenProject.dto;

import com.example.HeinikenProject.model.Buyer;
import com.example.HeinikenProject.model.HeinekenPointOfSale;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseCreateDto {

    private String buyerCpf;
    public List<ProductsPurchaseListDto> productsPurchaseListDto;
    private Long heinekenPointOfSaleId;
}
