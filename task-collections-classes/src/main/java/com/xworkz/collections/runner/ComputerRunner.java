package com.xworkz.collections.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.collections.dto.ComputerDto;

public class ComputerRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ComputerDto.class);

		Object result=context.getBean(ComputerDto.class);
		System.out.println(result);

	}

}
