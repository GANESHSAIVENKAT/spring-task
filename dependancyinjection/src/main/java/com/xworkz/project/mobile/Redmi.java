package com.xworkz.project.mobile;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Mobile;

@Component
public class Redmi  implements Mobile{

	public Redmi() {
		System.out.println("Redmi");
	}

}
