package com.xworkz.news.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.news.dto.NewsDto;

@Component
@RequestMapping("/")
public class NewsController {
	
	
	public NewsController() {
		System.out.println("NewsController");
	}

	NewsDto dto = new NewsDto();
	@GetMapping("/submit")
	public String getResponce(Model model) {
		System.out.println("getResponce");
		model.addAttribute("dto",dto);
		
		return "success.jsp";
	}
}
