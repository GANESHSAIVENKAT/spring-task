package com.xworkz.collections.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BuildingsDto {


    @Value("Xworkz")
    private String name;          
    @Value("Btm")
    private String location;     
    @Value("381")
    private int height;           
    @Value("1931")
    private int yearBuilt;       
    @Value("102")
    private int floors;    
}
