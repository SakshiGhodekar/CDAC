package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("spring.properties")
public class MyConfig {
	
	@Bean
	public PropertySourcesPlaceholderConfigurer getMyConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
