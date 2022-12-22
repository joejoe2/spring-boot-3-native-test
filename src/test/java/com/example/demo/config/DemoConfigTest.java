package com.example.demo.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class DemoConfigTest {
    @Autowired
    DemoConfig config;

    @Test
    void getConfig() {
        System.out.println("current is in "+config.getConfig()+" mode");
        assertEquals("test", config.getConfig());
    }
}