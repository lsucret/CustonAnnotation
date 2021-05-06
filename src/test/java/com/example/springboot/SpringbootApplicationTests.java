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
        fileSystemStorageService.readFile("test");
    }

}
