package com.xworkz.project.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.project.configuration.SpringConfiguration;


public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		System.out.println(context.getBeanDefinitionCount());
		String instance[]=context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instance));
	}

}
