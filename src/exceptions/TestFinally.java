package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFinally {

	public static void main(String[] args) {
		// Case 1 not match for exceptions
		try {
			String s=null;
			
		}catch(ArithmeticException e){
			System.out.println(" NullPointer Exception");
		}
		
		finally {
			System.out.println(" This is Finally block");
		}
		
		System.out.println(" programmer as definded ");
		// Conclouse: control will coming to try raised the exception catch block not match in 
		/* Exception actual abnormal termination before ABT Finally block will be Executed 
		 * 
		 */
		// Case 2 exception is match for catch block
		System.out.println("CASE-2"); 
		
		try {
			String s []= {"Rama","Raja","Boss"};
			System.out.println(s[4]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOFBoundsException ");
		}
		
		finally {
			System.out.println(" This is Finally block");
		}
		System.out.println(" programmer as definded ");
		
		// Case-3 1.Finally Block will not Executed
		
		System.out.println("---------case-3-----------");
		
		//System.out.println(20/0);
		try {
			String s []= {"Rama","Raja","Boss"};
			System.out.println(s[4]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOFBoundsException ");
		}
		
		finally {
			System.out.println(" This is Finally block");
		}
		System.out.println(" programmer as definded ");
		
		// Whenever using exit() method jvm shutdown  that time will finally block will not excuted
		/*try {
			String s []= {"Rama","Raja","Boss"};
			System.out.println(s[2]);
			System.exit(0);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOFBoundsException ");
		}
		
		finally {
			System.out.println(" This is Finally block");
		}
		System.out.println(" programmer as definded ");
		
		
		// Case -4 if Catch block raised the Exception 
		any where raised the Exception with out try block we get ABT
	*/	
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(20/0);
		}finally {
			System.out.println(" Not handle by Arithmetic exception in catch block ");
		}
		// Case 5 If raised the Exception in finally block what happen
		/*
		 * whenever the exception is raised the finally block will not executed and stopping the 
		 * all the statements
		 */
		try {
			FileInputStream fis =new FileInputStream("str.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			//System.out.println(20/0);
		}
		System.out.println("Rest of the code ");
	
	//Case 6 Using try catch in finally block
	try {
		FileInputStream fis =new FileInputStream("str.txt");
	}catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
	}finally {
		try {
		System.out.println(20/0);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	  System.out.println("Rest of the code ");
}
}
