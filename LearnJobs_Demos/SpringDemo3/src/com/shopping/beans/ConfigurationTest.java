package com.shopping.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationTest {

	ConfigurationTest(){
		System.out.println("Configurationtest constructor is invoked");
	}
	
	@Bean
	public Address createAddress() {
		System.out.println("Create Address invoked");
		return new Address();
	}
}
