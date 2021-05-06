package com.example.springboot.service;

import com.example.springboot.common.AfterThrowingReadFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class FileSystemStorageService {

    @AfterThrowingReadFile
    public List<String> readFile(String name) throws Exception {
        log.info("Reading file: {}", name);
        FileInputStream test = new FileInputStream(name);
        // Skipped
//        return new ArrayList<>();
        throw new Exception();
    }
}