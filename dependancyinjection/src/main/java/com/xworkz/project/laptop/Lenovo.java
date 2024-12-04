package com.xworkz.project.laptop;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Laptop;

@Component
public class Lenovo implements Laptop {

	public Lenovo() {
		System.out.println("Lenovo");
	}

}
