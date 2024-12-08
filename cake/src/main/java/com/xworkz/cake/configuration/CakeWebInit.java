package com.xworkz.cake.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class CakeWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	 @Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		
		configurer.enable();
	}
	 
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {CakeConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getservlet");
		return new String[] {"/"};
	}


}
