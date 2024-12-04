package com.xworkz.project.config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class Configuration {

	public Configuration() {
		System.out.println("Configuration");
	}

}
