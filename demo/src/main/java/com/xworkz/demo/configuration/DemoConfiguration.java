package com.xworkz.demo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class DemoConfiguration {

	public DemoConfiguration() {
		System.out.println("DemoConfiguration");
	}
}
