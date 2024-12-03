package com.xworkz.collections.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CupsDto {

	@Value("Coffee Mug")
	private String type; 
	@Value("Ceramic")
	private String material; 
	@Value("250ml")
	private String capacity; 
	@Value("Blue")
	private String color; 
	@Value("100")
	private String price;
}
