package com.xworkz.project.laptop;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Laptop;

@Component
public class Asus implements Laptop {

	public Asus() {
		System.out.println("Asus");
	}

}
