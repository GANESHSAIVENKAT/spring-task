package com.xworkz.bags.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz")
public class BagsConfiguration {

	public BagsConfiguration() {
		System.out.println("BagsConfiguration");
	}
}
