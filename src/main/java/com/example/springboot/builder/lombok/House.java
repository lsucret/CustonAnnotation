package com.example.springboot.builder.lombok;

import lombok.Builder;

@Builder
public class House {
    private String basement;
    private String structure;
    private String roof;
    private String interior;
}
