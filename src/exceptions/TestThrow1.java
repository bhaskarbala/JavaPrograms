package exceptions;

import java.util.Scanner;

public class TestThrow1 {
	static void appAmount(int amount)  throws WeContHelp{
		
		if(amount>20) {
			System.out.println("we have download to click on");
		}else
		{
			throw new WeContHelp(" you have suffienty blance");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub

		// Example:2
		/*
		 * normal class we should be extends RuntimeException only unChecked Exception
		 * 1. 0.arg Constructor
		 * 2. params cons approach
		 *  
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
		try {
			TestThrow1.appAmount(s.nextInt());
		}catch(WeContHelp e) {
			System.out.println(e.getMessage());
		}
		finally {
		TestThrow.age(s.nextInt());
	}

}}
