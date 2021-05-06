package com.example.springboot.common;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {
    @AfterThrowing("@annotation(com.example.springboot.common.AfterThrowingReadFile)")
    public void logAfterMethodCall() {
        log.info("After Throwing target");
    }
}
