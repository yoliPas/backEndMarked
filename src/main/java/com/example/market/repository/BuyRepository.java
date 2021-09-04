package com.example.market.repository;

import com.example.market.model.Buy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface BuyRepository extends GenericRepository<Buy> {
    public Buy findAllByValue(BigDecimal value);

}  
    