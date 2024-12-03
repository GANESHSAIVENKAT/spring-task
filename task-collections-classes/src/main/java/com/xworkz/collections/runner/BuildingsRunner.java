package com.xworkz.collections.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.collections.dto.BuildingsDto;


public class BuildingsRunner {

	public static void main(String[] args) {
		
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BuildingsDto.class);

			Object result=context.getBean(BuildingsDto.class);
			System.out.println(result);

		}

	

}
