package com.example.HeinikenProject.controller;

import com.example.HeinikenProject.dto.PurchaseCreateDto;
import com.example.HeinikenProject.service.PurchaseService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor @RestController @RequestMapping("/api")
public class IndexController {
    private final PurchaseService purchaseService;
    @PostMapping("/purchaseCreate")
    public ResponseEntity purchaseCreate (@Valid @RequestBody PurchaseCreateDto purchaseCreateDto){
        return purchaseService.purchaseCreate(purchaseCreateDto);
    }


}
