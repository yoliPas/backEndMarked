/*
    @uthor: Yolanda Pascual Rivera
*/

package com.example.market.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity

public class Buy extends ModelBase {

    @Column(precision = 10, scale = 5)
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
