package com.xworkz.collections.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class RoadDto {

    @Value("MG Road")          
    private String name;

    @Value("Highway")         
    private String type;

    @Value("12.5")             
    private double length;

    @Value("Bangalore")       
    private String city;

    @Value("4")               
    private int lanes;
}
