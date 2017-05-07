package com.example;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class TestConfig {

	@Bean
	@Primary
	public SomeService getSomeTestService() {
		return new SomeServiceTestImpl();
	}
}
