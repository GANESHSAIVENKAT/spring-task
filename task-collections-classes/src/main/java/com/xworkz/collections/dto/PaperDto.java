package com.xworkz.collections.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class PaperDto {

	@Value("A4")
    private String size;          
    @Value("White")
    private String color;         
    @Value("100")
    private int gsm;             
    @Value("JK Paper")
    private String brand;       
    @Value("500")
    private int numberOfSheets;  
}
