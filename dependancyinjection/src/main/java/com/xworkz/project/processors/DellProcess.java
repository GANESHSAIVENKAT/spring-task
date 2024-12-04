package com.xworkz.project.processors;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.OperatingSystem;

@Component
public class DellProcess implements OperatingSystem {

	public DellProcess() {
		System.out.println("Dell Processor");
	}

}
