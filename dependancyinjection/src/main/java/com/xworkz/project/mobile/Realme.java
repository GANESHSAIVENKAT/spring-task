package com.xworkz.project.mobile;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Mobile;

@Component
public class Realme implements Mobile{

	public Realme() {
		System.out.println("Realme");
	}

}
