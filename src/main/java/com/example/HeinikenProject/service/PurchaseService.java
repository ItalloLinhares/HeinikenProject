package com.example.HeinikenProject.service;

import com.example.HeinikenProject.dto.PurchaseCreateDto;
import com.example.HeinikenProject.model.Purchase;
import org.springframework.http.ResponseEntity;

public interface PurchaseService {
    public ResponseEntity purchaseCreate(PurchaseCreateDto purchaseCreateDto);

    public Long getPurchaseValue(PurchaseCreateDto purchaseCreateDto);

    public Purchase savePurchase(PurchaseCreateDto purchaseCreateDto, long purchaseValue);
}