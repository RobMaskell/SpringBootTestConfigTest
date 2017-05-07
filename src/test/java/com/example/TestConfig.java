package com.example;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {

	@Bean
	public SomeService getSomeTestService() {
		return new SomeServiceTestImpl();
	}
}
