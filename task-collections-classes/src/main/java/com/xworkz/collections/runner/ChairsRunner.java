package com.xworkz.collections.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.collections.dto.ChairsDto;

public class ChairsRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ChairsDto.class);

		Object result = context.getBean(ChairsDto.class);
		System.out.println(result);

	}
}
