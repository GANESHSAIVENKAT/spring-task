package com.xworkz.project.laptop;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Laptop;

@Component
public class Thinkpad implements Laptop {

	public Thinkpad() {
		System.out.println("Thinkpad");
	}

}
