package com.ite.product_ms.config;

import co.istad.gradesbot.features.question.dto.AnswerRequestDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JacksonConfig {

    @Primary
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // Register the JavaTimeModule
        mapper.registerModule(new JavaTimeModule());
        // Disable the WRITE_DATES_AS_TIMESTAMPS feature
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        // Register the custom deserializer
        AnswerRequestDeserializer.registerTo(mapper);
        return mapper;
    }

}