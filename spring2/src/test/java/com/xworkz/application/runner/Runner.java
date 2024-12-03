package com.xworkz.application.runner;

import org.apache.catalina.tribes.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.application.configuratin.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		System.out.println(con.getBeanDefinitionCount());
		
		String instance[]=con.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instance));
	}

}
