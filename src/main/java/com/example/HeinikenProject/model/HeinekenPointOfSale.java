package com.example.HeinikenProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
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
    private int heinekenPointOfSaleID;
    @Digits(integer = 6, fraction = 2)
    private long heinekenPointOfSaleBalance;
}
