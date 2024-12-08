package com.xworkz.cake.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class CakeConfiguration {

	public CakeConfiguration() {
		System.out.println("CakeConfiguration");
	}
}
