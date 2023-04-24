package com.example.HeinikenProject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long purchaseId;
    @ManyToOne @NotEmpty
    private Buyer buyerCpf;
    @NotEmpty @Digits(integer = 4, fraction = 2)
    private long purchaseValue;


}
