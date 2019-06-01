package exceptions;

import java.util.Scanner;

public class TestThrow {
 static void age(int age) throws InvalidAgeException {
	 if(age>=18) {
		System.out.println("Eligible for Vote"); 
	 }
	 else
	 {
		 throw new InvalidAgeException(" Your not eligible for Vote");
	 }
	 
 }
	public static void main(String[] args) {
		// Example:1
					/*
					 * normal class we should be extends Exception only Checked Exception
					 * 1. 0.arg Constructor
					 * 2. params cons approach
					 */
	 Scanner s= new Scanner (System.in);
	 System.out.println("Enter the Age");
	 try {
	 TestThrow.age(s.nextInt());
	 }catch(InvalidAgeException e) {
		 System.out.println(e.getMessage());
	 }
	 }
		
		
		
		
		
		

		
			

	}


