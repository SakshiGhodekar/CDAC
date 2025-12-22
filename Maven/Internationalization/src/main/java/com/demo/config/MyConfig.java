package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MyConfig {
	
	@Bean
	public ResourceBundleMessageSource myMessageSource() {
		ResourceBundleMessageSource rm = new ResourceBundleMessageSource();
		rm.setBasename("messages");
		return rm;
	}

}
