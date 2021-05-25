package com.example.springboot.builder.lombok;

import org.springframework.stereotype.Component;

//@Component
public class Main {

    public static void main(String[] args) {
        House iglooHouse = House.builder()
                .basement("ice brick")
                .interior("ice carve")
                .roof("ice wall")
                .structure("ice poll")
                .build();
        System.out.println();
    }
}
