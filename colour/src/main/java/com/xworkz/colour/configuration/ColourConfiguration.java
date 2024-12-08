package com.xworkz.colour.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class ColourConfiguration {

	public ColourConfiguration() {
		System.out.println("ColourConfiguration");
	}

}
