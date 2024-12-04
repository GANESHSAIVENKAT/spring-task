package com.xworkz.project.laptop;


import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Laptop;

@Component
public class Dell implements Laptop{

	public Dell() {
		System.out.println("Dell");
	}

}
