package com.xworkz.tshirt.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class TshirtController {

	public TshirtController() {
		System.out.println("TshirtController");
	}
	
	
    @GetMapping("/submit")
    public String getTShirtNames(Model model) {
        System.out.println("getTShirtNames called");
        Set<String> tShirtNames = new HashSet<>();
        tShirtNames.add("Round Neck Tee");
        tShirtNames.add("Polo T-Shirt");
        tShirtNames.add("V-Neck Tee");
        tShirtNames.add("Graphic Tee");
        tShirtNames.add("Henley T-Shirt");

        model.addAttribute("tShirts", tShirtNames);
        return "success.jsp";
    }
}
