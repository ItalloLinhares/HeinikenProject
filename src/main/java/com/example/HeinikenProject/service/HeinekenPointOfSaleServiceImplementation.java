package com.example.HeinikenProject.service;

import com.example.HeinikenProject.model.HeinekenPointOfSale;
import com.example.HeinikenProject.repository.HeinekinPointOfSaleRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service @Transactional @AllArgsConstructor
public class HeinekenPointOfSaleServiceImplementation implements HeinekenPointOfSaleService{
    private final HeinekinPointOfSaleRepository heinekinPointOfSaleRepository;
    @Override
    public void addBalance(HeinekenPointOfSale heinekenPointOfSale, long purchaseValue) {
        heinekenPointOfSale.setHeinekenPointOfSaleBalance(
                heinekenPointOfSale.getHeinekenPointOfSaleBalance() + purchaseValue);
        heinekinPointOfSaleRepository.save(heinekenPointOfSale);
    }
}
