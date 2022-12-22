package com.example.demo;

import com.example.demo.config.DemoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @Autowired
    DemoConfig config;

    @GetMapping(path = "/")
    @DummyAnnotation(value = "dummy annotation on index !")
    public ResponseEntity index(){
        return ResponseEntity.ok("current is in "+config.getConfig()+" mode");
    }
}
