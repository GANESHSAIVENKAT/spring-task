package com.xworkz.collections.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.collections.dto.PaperDto;

public class PaperRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PaperDto.class);

		Object result = context.getBean(PaperDto.class);
		System.out.println(result);

	}

}
