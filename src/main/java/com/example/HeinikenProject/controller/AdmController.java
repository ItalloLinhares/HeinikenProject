package com.example.HeinikenProject.controller;

import com.example.HeinikenProject.model.Crate;
import com.example.HeinikenProject.model.HeinekenPointOfSale;
import com.example.HeinikenProject.model.ProductsCrate;
import com.example.HeinikenProject.repository.CrateRepository;
import com.example.HeinikenProject.repository.HeinekinPointOfSaleRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/adm") @AllArgsConstructor
public class AdmController {
    private final HeinekinPointOfSaleRepository heinekinPointOfSaleRepository;
    private final CrateRepository crateRepository;
    @PostMapping("/createPoinOfSale")
    public void createPoinOfSale(){
        HeinekenPointOfSale heinekenPointOfSale = new HeinekenPointOfSale(null, 1000);

        heinekinPointOfSaleRepository.save(heinekenPointOfSale);
        for (ProductsCrate pc : ProductsCrate.values()){
            for (int i = 1; i <= 10; i++) {
                Crate crate = new Crate(null, heinekenPointOfSale, pc, pc.getProductQuantityperCrate());
                crateRepository.save(crate);
            }
        }
    }


}
