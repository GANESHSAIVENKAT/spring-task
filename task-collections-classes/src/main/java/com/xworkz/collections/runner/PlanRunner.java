package com.xworkz.collections.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.collections.dto.PlansDto;

public class PlanRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlansDto.class);

		Object result = context.getBean(PlansDto.class);
		System.out.println(result);

	}

}
