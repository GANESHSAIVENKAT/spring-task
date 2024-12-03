package com.xworkz.collections.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ChairsDto {

	@Value("Office Chair")
	private String type;
	@Value("Steel")
	private String material;
	@Value("Black")
	private String color;
	@Value("Adjustable")
	private String features;
	@Value("5000")
	private String price;
}
