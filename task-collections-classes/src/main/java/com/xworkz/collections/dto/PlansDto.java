package com.xworkz.collections.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PlansDto {

    @Value("Monthly Subscription")
    private String type;          
    @Value("2000")
    private String cost;        
    @Value("1 Year")
    private String duration;     
    @Value("Active")
    private String status;       
    @Value("Premium")
    private String tier;  
}
