package com.example.HeinikenProject.repository;

import com.example.HeinikenProject.model.HeinekenPointOfSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeinekinPointOfSaleRepository extends JpaRepository<HeinekenPointOfSale, Long> {
}
