package com.xworkz.colour.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ColourWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
	
}
	public ColourWebInit() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ColourConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getservlet");
		return new String[] {"/"};
	}

}
