package com.example.HeinikenProject.service;

import com.example.HeinikenProject.dto.ProductsPurchaseListDto;
import com.example.HeinikenProject.dto.PurchaseCreateDto;
import com.example.HeinikenProject.model.Purchase;
import com.example.HeinikenProject.repository.PurchaseRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service @Transactional @AllArgsConstructor
public class PurchaseServiceImplementation implements PurchaseService{
    private final PurchaseRepository purchaseRepository;
    private final BuyerService buyerService;
    private final HeinekenPointOfSaleService heinekenPointOfSaleService;
    @Override
    public ResponseEntity purchaseCreate(PurchaseCreateDto purchaseCreateDto) {
        long purchaseValue = buyerService.createPurchaseBuyer(purchaseCreateDto,
                getPurchaseValue(purchaseCreateDto));

        Purchase purchase = savePurchase(purchaseCreateDto, purchaseValue);

        heinekenPointOfSaleService.addBalance(purchaseCreateDto.getHeinekenPointOfSale(), purchaseValue);

        return ResponseEntity.ok().body(purchase);
    }
    @Override
    public Purchase savePurchase(PurchaseCreateDto purchaseCreateDto, long purchaseValue){
        Purchase purchase = new Purchase (null,
                purchaseCreateDto.getHeinekenPointOfSale(),
                buyerService.findBuyer(purchaseCreateDto.getBuyerCpf()),
                getPurchaseValue(purchaseCreateDto));
        purchaseRepository.save(purchase);
        return purchase;
    }
    @Override
    public Long getPurchaseValue(PurchaseCreateDto purchaseCreateDto) {
        Long purchaseValue = Long.valueOf(0);
        for (ProductsPurchaseListDto productItem : purchaseCreateDto.productsPurchaseListDto){
            purchaseValue += (long) productItem.getProductsCrate().getPrice() * productItem.getProductsPurchaseQuantity();
        }
        return purchaseValue;
    }
}
