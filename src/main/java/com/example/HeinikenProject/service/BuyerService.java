package com.example.HeinikenProject.service;

import com.example.HeinikenProject.dto.PurchaseCreateDto;
import com.example.HeinikenProject.model.Buyer;
import org.springframework.http.ResponseEntity;

public interface BuyerService {
    public long createPurchaseBuyer(PurchaseCreateDto purchaseCreateDto, long purchaseValue);

    public long verifyDiscount(Buyer buyer, long purchaseValue);

    public void verifyExistingCPF(String buyerCPF);

    public long applyDiscount(long purchaseValue);

    public Buyer findBuyer(String buyerCPF);
    }
