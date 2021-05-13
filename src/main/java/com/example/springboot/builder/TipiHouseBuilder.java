package com.example.springboot.builder;

public class TipiHouseBuilder implements HouseBuilder {
    private House house;

    @Override
    public void buildBasement() {
        house.setBasement("Wood Stick");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood + leaf");
    }

    @Override
    public void buildRoof() {
        house.setRoof("banana leaf");
    }

    @Override
    public void buildInterior() {
        house.setInterior("coconut");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
