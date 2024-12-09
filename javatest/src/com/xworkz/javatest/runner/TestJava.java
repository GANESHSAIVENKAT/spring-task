package com.xworkz.javatest.runner;


import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[]num=new int[5];
		
		for (int i = 0; i < num.length; i++) {
			try {
				String input = scanner.nextLine();
				 num[i] = Integer.parseInt(input); 
				
			}catch(NumberFormatException e){
				System.out.println("Please enter integer.");
			}
		}
scanner.close();
	}

}
