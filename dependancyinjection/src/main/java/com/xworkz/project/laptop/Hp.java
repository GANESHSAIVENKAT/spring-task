package com.xworkz.project.laptop;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Laptop;

@Component
public class Hp implements Laptop {

	public Hp() {
		System.out.println("Hp");
	}

}
