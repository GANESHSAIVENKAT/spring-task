package com.xworkz.collections.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.collections.dto.CupsDto;



public class CupsRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CupsDto.class);

		Object result = context.getBean(CupsDto.class);
		System.out.println(result);

	}

}
