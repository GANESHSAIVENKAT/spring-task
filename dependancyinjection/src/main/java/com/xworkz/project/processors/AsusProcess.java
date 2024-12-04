package com.xworkz.project.processors;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.OperatingSystem;

@Component
public class AsusProcess implements OperatingSystem {

	public AsusProcess() {
		System.out.println("Asus Processor");
	}

}
