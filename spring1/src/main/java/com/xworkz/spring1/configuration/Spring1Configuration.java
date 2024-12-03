package com.xworkz.spring1.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class Spring1Configuration {

	public Spring1Configuration() {
		System.out.println("Spring1Configuration");
	}

}
