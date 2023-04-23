package com.example.HeinikenProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private int productId;
    @Digits(integer = 3 ,fraction = 2)
    private long productValue;
    @Max(3)
    private int productQuantityperCrate;
}
