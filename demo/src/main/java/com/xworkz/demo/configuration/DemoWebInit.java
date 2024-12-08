package com.xworkz.demo.configuration;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DemoWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	


	 @Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		
		configurer.enable();
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {DemoConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getservlet");
		return new String[] {"/"};
	}

}