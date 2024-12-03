package com.xworkz.collections.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PowerBankDto {

	@Value("Mi PowerBank")
	private String brand; // Brand of the power bank
	@Value("20000mAh")
	private String capacity; // Capacity of the power bank
	@Value("Black")
	private String color; // Color of the power bank
	@Value("2")
	private int usbPorts; // Number of USB ports
	@Value("1500")
	private String price;
}
