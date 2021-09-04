/*
    @uthor: Yolanda Pascual Rivera
*/

package com.example.market.dto;



import com.example.market.model.ModelBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;


public class BuyDto extends ModelBase {

    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
