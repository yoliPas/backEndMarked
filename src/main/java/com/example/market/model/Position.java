package com.example.market.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Position extends ModelBase {

    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
