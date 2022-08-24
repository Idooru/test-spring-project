package com.example.myspringproject.entities;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductEntity {
    private final String name;
    private final int price;
    private final String type;

    public ProductEntity(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProductEntity{" + "name='" + name + '\'' + ", price=" + price + ", type='" + type + '\'' + '}';
    }
}
