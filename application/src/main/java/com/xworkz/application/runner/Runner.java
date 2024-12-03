package com.xworkz.application.runner;

import org.apache.catalina.tribes.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.application.configuration.ApplicationConfiguration;

public class Runner {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		System.out.println(c.getBeanDefinitionCount());
		String ref[]= c.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
	}
}
