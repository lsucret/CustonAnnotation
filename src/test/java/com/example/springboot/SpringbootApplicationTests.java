package com.example.springboot;

import com.example.springboot.service.FileSystemStorageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    FileSystemStorageService fileSystemStorageService;

    @Test
    void contextLoads() throws Exception {
//        fileSystemStorageService.readFile("test");
    }

    @Test
    void builderTest() {
//        Animal animal = Animal.builder().height(158).weight(45).build();
//        System.out.println(animal.toString());
//        System.out.println(Animal.builder().height(123).weight(33).toString());
//        StringBuilder test = new StringBuilder();
//        test.append(123).append("asdf");
//        System.out.println(test);
    }
}
