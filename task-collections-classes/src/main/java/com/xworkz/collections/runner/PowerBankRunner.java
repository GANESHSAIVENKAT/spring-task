package com.xworkz.collections.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.collections.dto.PowerBankDto;

public class PowerBankRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PowerBankDto.class);

		Object result = context.getBean(PowerBankDto.class);
		System.out.println(result);

	}

}
