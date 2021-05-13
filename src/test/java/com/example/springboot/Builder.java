package com.example.springboot;

import com.example.springboot.builder.CivilEngineer;
import com.example.springboot.builder.House;
import com.example.springboot.builder.HouseBuilder;
import com.example.springboot.builder.IglooHouseBuilder;
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
