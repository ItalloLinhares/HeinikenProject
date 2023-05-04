package com.example.HeinikenProject.services;

import com.example.HeinikenProject.dto.ProductsPurchaseListDto;
import com.example.HeinikenProject.dto.PurchaseCreateDto;
import com.example.HeinikenProject.model.ProductsCrate;
import com.example.HeinikenProject.repository.PurchaseRepository;
import com.example.HeinikenProject.service.PurchaseService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PurchaseServiceTest {
    private PurchaseService purchaseService;
    @Mock
    private PurchaseRepository purchaseRepository;
//    @Mock
//    private ProductsPurchaseListDto productsPurchaseListDto;

    @Test
    void itShouldSavePurchase(){
        ProductsPurchaseListDto productsPurchase = new ProductsPurchaseListDto(ProductsCrate.HEINIKEN, 4);
        List<ProductsPurchaseListDto> productsPurchaseListDto = new ArrayList<>();
        productsPurchaseListDto.add(productsPurchase);

        PurchaseCreateDto purchaseCreateDto = new PurchaseCreateDto( "86990194081", productsPurchaseListDto, Long.valueOf(1));


        
    }
}
