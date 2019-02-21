package com.alpha.dataapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DataApiApplication {

    public static void main(String[] args) {
		SpringApplication.run(DataApiApplication.class, args);
	}
}

