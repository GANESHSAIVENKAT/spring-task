package com.xworkz.cake.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CakeController {

	public CakeController() {
		System.out.println("CakeController");
	}
	
	@GetMapping("/submit")
	public String getResponce(Model model) {
		System.out.println("getResponce");
		model.addAttribute("message","HoneyCake");
		
		return "success.jsp";
	}
}
