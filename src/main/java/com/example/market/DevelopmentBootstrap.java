/*
    @uthor: Yolanda Pascual Rivera
*/

package com.example.market;

import com.example.market.model.Buy;
import com.example.market.repository.BuyRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DevelopmentBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private BuyRepository buyRepository;
    public DevelopmentBootstrap(BuyRepository buyRepository){
        this.buyRepository = buyRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Hola Spring Event");
        Buy buy = new Buy();
        buy.setValue(BigDecimal.TEN);
        buyRepository.save(buy);
    }
}
