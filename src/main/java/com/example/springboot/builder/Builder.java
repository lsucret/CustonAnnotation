package com.example.springboot.builder;

import com.example.springboot.builder.director.CivilEngineer;
import com.example.springboot.builder.builder.HouseBuilder;
import com.example.springboot.builder.product.House;
import com.example.springboot.builder.concreteBuilder.IglooHouseBuilder;

public class Builder {

    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(iglooBuilder);

        civilEngineer.constructHouse();
        House house = civilEngineer.getHouse();

        System.out.println(house);
    }
}
