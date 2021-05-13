package com.example.springboot.builder;

public class Builder {

    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(iglooBuilder);

        civilEngineer.constructHouse();
        House house = civilEngineer.getHouse();

        System.out.println(house);
    }
}
