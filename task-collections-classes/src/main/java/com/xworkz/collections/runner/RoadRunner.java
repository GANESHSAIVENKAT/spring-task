package com.xworkz.collections.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.collections.dto.RoadDto;

public class RoadRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(RoadDto.class);

		Object result=context.getBean(RoadDto.class);
		System.out.println(result);

	}
}
