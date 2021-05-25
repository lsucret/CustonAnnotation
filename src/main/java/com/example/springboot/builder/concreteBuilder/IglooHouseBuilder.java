package com.example.springboot.builder.concreteBuilder;

import com.example.springboot.builder.product.House;
import com.example.springboot.builder.builder.HouseBuilder;

public class IglooHouseBuilder implements HouseBuilder {
    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice Poll");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Brick");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Wall");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice flake");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
