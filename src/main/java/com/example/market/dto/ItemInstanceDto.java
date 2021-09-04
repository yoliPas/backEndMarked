package com.example.market.dto;

import com.example.market.model.ItemInstance;

public class ItemInstanceDto extends DtoBase<ItemInstance> {
    private ItemDto item;
    private String identifier;// sku
    private Boolean featured = Boolean.FALSE;
    private Double price;

    public ItemDto getItem() {
        return item;
    }

    public void setItemDto(ItemDto item) {
        this.item = item;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
