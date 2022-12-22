package com.example.demo.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.Instant;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class ModelTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void jackson() throws JsonProcessingException {
        Model model=Model.builder().id(UUID.randomUUID()).time(Instant.now()).content("test").build();
        String s=objectMapper.writeValueAsString(model);
        Model back=objectMapper.readValue(s, Model.class);
        assertEquals(model, back);
    }
}