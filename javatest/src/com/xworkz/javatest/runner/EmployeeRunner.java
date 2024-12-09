package com.xworkz.javatest.runner;

import java.util.HashMap;
import java.util.Map;



public class EmployeeRunner {

	public static void main(String[] args) {
		
		 HashMap<String, Double> empMap = new HashMap<>();

		 empMap.put("Ganesh", 8000000.00);
		 empMap.put("Rajesh", 7500000.00);
		 empMap.put("Malli", 6000000.00);
		 empMap.put("Shashi", 5000000.00);
		 empMap.put("Prajwal", 9000000.00);
		 
		for (Map.Entry<String,Double> emp : empMap.entrySet()) {
			if(emp.getValue()>75000) {
				System.out.println(emp.getKey()+emp.getValue());
			}
		}
		
		for (Map.Entry<String,Double> emp : empMap.entrySet()) {
			
		}
	}

}
