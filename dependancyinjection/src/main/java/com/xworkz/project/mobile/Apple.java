package com.xworkz.project.mobile;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Mobile;

@Component
public class Apple  implements Mobile{

	public Apple() {
		System.out.println("Apple");
	}

}
