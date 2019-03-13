package com.alpha.dataapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.alpha.dataapi"})
public class DataApiApplication {

    public static void main(String[] args) {
		SpringApplication.run(DataApiApplication.class, args);
	}
}

