package com.example.springboot;

import com.example.springboot.builder.director.CivilEngineer;
import com.example.springboot.builder.product.House;
import com.example.springboot.builder.builder.HouseBuilder;
import com.example.springboot.builder.concreteBuilder.IglooHouseBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Builder {

    @Test
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(iglooBuilder);

        civilEngineer.constructHouse();
        House house = civilEngineer.getHouse();

        System.out.println(house);
    }
}
