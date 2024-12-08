package com.xworkz.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class DemoController {

	public DemoController() {
		System.out.println("DemoController");
	}
@GetMapping("/submit")
	public String getResponce(Model model) {
		System.out.println("getResponce");
		model.addAttribute("message","we done with connection");
		
		return "success.jsp";
	}

@PostMapping("/post")
public String getPost() {
	System.out.println("getPost");
	return "success.jsp";
}

@GetMapping("/delete")
public String getdelete() {
	System.out.println("get delete");
	return "success.jsp";
}

@PostMapping("/update")
public String doupdate() {
	System.out.println("do update");
	return "success.jsp";
}
}
