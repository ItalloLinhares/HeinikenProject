package com.example.HeinikenProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Buyer {
    @Id @CPF
    private String buyerCpf;
    @NotEmpty
    private String buyerName;
    @NotEmpty @Digits(integer = 3, fraction = 2)
    private long buyerPromotionSocre;
}
