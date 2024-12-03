package com.xworkz.spring1.runner;

import org.apache.catalina.tribes.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring1.configuration.Spring1Configuration;

public class Runner {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext name = new AnnotationConfigApplicationContext(Spring1Configuration.class);

		System.out.println(name.getBeanDefinitionCount());
	String names[]	=name.getBeanDefinitionNames();
	System.out.println(Arrays.toString(names));
	
	}

}
