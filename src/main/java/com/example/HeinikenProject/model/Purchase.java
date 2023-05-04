package com.example.HeinikenProject.model;

import com.example.HeinikenProject.dto.ProductsPurchaseListDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long purchaseId;
    @ManyToOne
    private HeinekenPointOfSale heinekenPointOfSale;
    @ManyToOne @NotEmpty
    private Buyer buyer;
    @NotEmpty @Digits(integer = 4, fraction = 2)
    private long purchaseValue;

}
