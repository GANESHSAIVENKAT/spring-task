package com.xworkz.project.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.project.config.Configuration;
import com.xworkz.project.laptop.LaptopUser;
import com.xworkz.project.mobile.MobileDetails;
import com.xworkz.project.processors.OsDetails;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		
		System.out.println(context.getBeanDefinitionCount());
		String bean[]=context.getBeanDefinitionNames();

		for(String b: bean) {
			System.out.println(b);
		}

		System.out.println(context.getBean(LaptopUser.class));
		System.out.println("=============================================");
		System.out.println(context.getBean(MobileDetails.class));
		System.out.println("=============================================");
		System.out.println(context.getBean(OsDetails.class));
		System.out.println("=============================================");
		

		
	}

}
