package com.example.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

    private static final Logger log = LoggerFactory.getLogger(Demo1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }


}
