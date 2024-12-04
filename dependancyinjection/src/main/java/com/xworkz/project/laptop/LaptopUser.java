package com.xworkz.project.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Laptop;



@Component
public class LaptopUser {
	@Autowired
@Qualifier("dell")
	private Laptop laptop;

}
