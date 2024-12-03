package com.xworkz.collections.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ComputerDto {

	@Value("Samsung")
	private String brand;
	@Value("GalaxyBook")
	private String model;
	@Value("75000")
	private String price;
	@Value("16GB")
	private String ram;
	@Value("1TB SSD")
	private String storage;
	@Value("Intel i7")
	private String processor;
}
