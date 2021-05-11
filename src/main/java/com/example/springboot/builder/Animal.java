package com.example.springboot.builder;

import lombok.AccessLevel;
import lombok.Builder;

//@Builder(access = AccessLevel.PUBLIC)
public class Animal {
    private int height;
    private int weight;

    @Builder
    Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
}
