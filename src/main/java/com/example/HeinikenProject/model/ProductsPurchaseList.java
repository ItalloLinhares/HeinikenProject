package com.example.HeinikenProject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductsPurchaseList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productsPurchase;
    @NotNull
    private ProductsCrate productsCrate;
    @Min(1) @Max(100)
    private int productsPurchaseQuantity;
    @NotEmpty @Digits(integer = 4, fraction = 2)
    private long subtotal;
    @ManyToOne
    private Purchase purchaseId;
}
