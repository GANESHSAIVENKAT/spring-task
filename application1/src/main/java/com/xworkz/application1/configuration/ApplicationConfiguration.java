package com.xworkz.application1.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class ApplicationConfiguration {

	public ApplicationConfiguration() {
		System.out.println("ApplicationConfiguration");
	}

}
