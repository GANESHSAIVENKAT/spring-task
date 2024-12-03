package com.xworkz.collections.runner;

import org.apache.catalina.tribes.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.collections.configuration.CollectionsTask;

public class CollectionRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollectionsTask.class);

		System.out.println(context.getBeanDefinitionCount());
		
//		String instance[]=context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(instance));
		
		
		Object result=context.getBean("getLinkedlist");
		System.out.println(result);
		
	}

}
