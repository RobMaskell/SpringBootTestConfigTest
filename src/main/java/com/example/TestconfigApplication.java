package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestconfigApplication.class, args);
	}
	
	@Bean
	public SomeService getSomeService() {
		return new SomeServiceImpl();
	}
}
