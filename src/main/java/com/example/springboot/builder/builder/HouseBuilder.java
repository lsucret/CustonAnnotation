package com.example.springboot.builder.builder;

import com.example.springboot.builder.product.House;

public interface HouseBuilder {
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public House getHouse();
}
