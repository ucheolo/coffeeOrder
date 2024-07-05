package com.example.coffeeorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories(basePackages = "com.example.coffeeorder.repository")
public class CoffeeorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeorderApplication.class, args);
	}

}
