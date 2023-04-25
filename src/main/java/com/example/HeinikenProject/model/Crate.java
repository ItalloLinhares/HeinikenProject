package com.example.HeinikenProject.model;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long crateId;
    private ProductsCrate productsCrate;
    @Min(0)
    private int productQuantity;

}
