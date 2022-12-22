package com.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration(proxyBeanMethods = false)
public class DemoConfig {
    @Value("${demo.config}")
    String config;
}
