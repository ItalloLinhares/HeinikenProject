package com.example.HeinikenProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class HeinekenPointOfSale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long heinekenPointOfSaleID;
    @Digits(integer = 6, fraction = 2)
    @Min(0)
    private long heinekenPointOfSaleBalance;
}
