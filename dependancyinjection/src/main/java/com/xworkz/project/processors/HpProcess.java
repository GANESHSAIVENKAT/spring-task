package com.xworkz.project.processors;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.OperatingSystem;

@Component
public class HpProcess implements OperatingSystem{

	public HpProcess() {
	System.out.println("Hp Processor");
	}

}
