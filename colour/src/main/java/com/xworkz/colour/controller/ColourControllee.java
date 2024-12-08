package com.xworkz.colour.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ColourControllee {

	public ColourControllee() {
		System.out.println("ColourControllee");
	}
@GetMapping("/submit")
	public String getResponce(Model model) {
		System.out.println("getResponce");
	Map<Integer, String> color=new HashMap<>();
	color.put(1,"red");
	color.put(2, "Blue");
	color.put(3, "Green");
	color.put(4, "Yellow");
	color.put(5, "Orange");
	color.put(6, "Purple");
	color.put(7, "Black");
	color.put(8, "White");
	color.put(9, "Pink");
	color.put(10, "Brown");
	
	model.addAttribute("colours", color);
	return "success.jsp";
		
	}
}
