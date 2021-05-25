package com.example.springboot.builder.lombok;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

//@Entity
//@Table(name = "product")
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC) // 테스트를 위해 임시로 Public, 의도한 코드는 PROTECTED
public class Product {

//    @Id
    private String id;

    private String name;

    @Builder
    public Product(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }
}