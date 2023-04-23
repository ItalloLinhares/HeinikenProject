package com.example.HeinikenProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Crate {
    @Id
    private int crateId;
    @ManyToOne
    private Product productId;
    @Min(0)
    private int productQuantity;

}
