package com.xworkz.project.mobile;

import org.springframework.stereotype.Component;

import com.xworkz.project.interfaces.Mobile;

@Component
public class SamSung  implements Mobile{

	public SamSung() {
		System.out.println("Samsung");
	}

}
