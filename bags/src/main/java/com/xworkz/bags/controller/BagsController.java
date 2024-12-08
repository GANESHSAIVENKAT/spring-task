package com.xworkz.bags.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BagsController {

	public BagsController() {
		System.out.println("BagsController");
	}
	
	 @GetMapping("/submit")
	    public String getBagNames(Model model) {
	        System.out.println("Fetching list of bags");

	       
	        List<String> bagNames = new ArrayList<>();
	        bagNames.add("Leather Bag");
	        bagNames.add("Backpack");
	        bagNames.add("Travel Bag");
	        bagNames.add("Handbag");
	        bagNames.add("Messenger Bag");

	        model.addAttribute("bagnames", bagNames);
	        
	        return "success.jsp"; 
	    }
	
}
