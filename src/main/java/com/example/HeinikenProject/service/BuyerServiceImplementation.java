package com.example.HeinikenProject.service;

import com.example.HeinikenProject.dto.PurchaseCreateDto;
import com.example.HeinikenProject.model.Buyer;
import com.example.HeinikenProject.repository.BuyerRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service @AllArgsConstructor @Transactional
public class BuyerServiceImplementation implements BuyerService{
    private final BuyerRepository buyerRepository;
    @Override
    public long createPurchaseBuyer(PurchaseCreateDto purchaseCreateDto, long purchaseValue) {
        verifyExistingCPF(purchaseCreateDto.getBuyerCpf());
        return verifyDiscount(buyerRepository.findById(purchaseCreateDto.getBuyerCpf()).get(), purchaseValue);

    }
    @Override
    public void verifyExistingCPF(String buyerCPF){
        if (buyerRepository.findById(buyerCPF) == null){
             Buyer buyer = new Buyer(buyerCPF, 0);
             buyerRepository.save(buyer);
        }
    }

    @Override
    public long verifyDiscount(Buyer buyer, long purchaseValue){
        if (buyer.getBuyerPromotionSocre() >= 100) {
            buyer.setBuyerPromotionSocre(0);
            return applyDiscount(purchaseValue);}

        buyer.setBuyerPromotionSocre(buyer.getBuyerPromotionSocre() + purchaseValue);
        return purchaseValue;
    }

    @Override
    public long applyDiscount(long purchaseValue){
        if(purchaseValue*0.1 > 50){return purchaseValue-50;}

        return (long) (purchaseValue*0.9);
    }

    public Buyer findBuyer(String buyerCPF){
        Optional<Buyer> buyer = buyerRepository.findById(buyerCPF);
        if (buyer == null){throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Client Not Found");};
        return buyer.get();
    }

}
